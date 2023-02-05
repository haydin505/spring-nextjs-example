import {InferGetStaticPropsType} from "next";

interface Product {
	id: number;
	productTitle: string;
}

export default function Products({products}: InferGetStaticPropsType<typeof getStaticProps>) {
	return (
		<>
			<ul>{products.map(product => <li key={product.id}>{product.productTitle}</li>)}</ul>
		</>)
}

// This function gets called at build time
export async function getStaticProps() {
	// Call an external API endpoint to get posts
	const res = await fetch("http://localhost:8080/api/products");
	const products: Product[] = await res.json()
	// By returning { props: { products } }, the Blog component
	// will receive `products` as a prop at build time
	return {
		props: {
			products,
		},
	}
}