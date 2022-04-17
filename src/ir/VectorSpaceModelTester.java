package ir;

import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * the tester class.
 * @author swapneel
 */
public class VectorSpaceModelTester {

	public static void main(String[] args) {
		

		Document pop1 = new Document("pop-1.txt");
		Document pop2 = new Document("pop-2.txt");
		Document pop3 = new Document("pop-3.txt");
		Document pop4 = new Document("pop-4.txt");
		Document pop5 = new Document("pop-5.txt");
		Document pop6 = new Document("pop-6.txt");
		Document pop7 = new Document("pop-7.txt");
		Document pop8 = new Document("pop-8.txt");
		Document pop9 = new Document("pop-9.txt");
		Document pop10 = new Document("pop-10.txt");
		
		Document hiphop1 = new Document("hip-hop-1.txt");
		Document hiphop2 = new Document("hip-hop-2.txt");
		Document hiphop3 = new Document("hip-hop-3.txt");
		Document hiphop4 = new Document("hip-hop-4.txt");
		Document hiphop5 = new Document("hip-hop-5.txt");
		Document hiphop6 = new Document("hip-hop-6.txt");
		Document hiphop7 = new Document("hip-hop-7.txt");
		Document hiphop8 = new Document("hip-hop-8.txt");
		Document hiphop9 = new Document("hip-hop-9.txt");
		Document hiphop10 = new Document("hip-hop-10.txt");
		
		Document country1 = new Document("country-1.txt");
		Document country2 = new Document("country-2.txt");
		Document country3 = new Document("country-3.txt");
		Document country4 = new Document("country-4.txt");
		Document country5 = new Document("country-5.txt");
		Document country6 = new Document("country-6.txt");
		Document country7 = new Document("country-7.txt");
		Document country8 = new Document("country-8.txt");
		Document country9 = new Document("country-9.txt");
		Document country10 = new Document("country-10.txt");
		
		ArrayList<Document> documentsPop = new ArrayList<Document>();
		documentsPop.add(pop1);
		documentsPop.add(pop2);
		documentsPop.add(pop3);
		documentsPop.add(pop4);
		documentsPop.add(pop5);
		documentsPop.add(pop6);
		documentsPop.add(pop7);
		documentsPop.add(pop8);
		documentsPop.add(pop9);
		documentsPop.add(pop10);
		
		ArrayList<Document> documentsHipHop = new ArrayList<Document>();
		documentsHipHop.add(hiphop1);
		documentsHipHop.add(hiphop2);
		documentsHipHop.add(hiphop3);
		documentsHipHop.add(hiphop4);
		documentsHipHop.add(hiphop5);
		documentsHipHop.add(hiphop6);
		documentsHipHop.add(hiphop7);
		documentsHipHop.add(hiphop8);
		documentsHipHop.add(hiphop9);
		documentsHipHop.add(hiphop10);
		
		ArrayList<Document> documentsCountry = new ArrayList<Document>();
		documentsCountry.add(country1);
		documentsCountry.add(country2);
		documentsCountry.add(country3);
		documentsCountry.add(country4);
		documentsCountry.add(country5);
		documentsCountry.add(country6);
		documentsCountry.add(country7);
		documentsCountry.add(country8);
		documentsCountry.add(country9);
		documentsCountry.add(country10);

		//Average cosine sumilarity of top 10 pop songs =================================
		Corpus corpusPop = new Corpus(documentsPop);
		
		VectorSpaceModel vectorSpacePop = new VectorSpaceModel(corpusPop);
		
		Double cosineSumPop = 0.0;
		int numPairs = 0;
		
		for (int i = 0; i < documentsPop.size(); i++) {
			for (int j = i + 1; j < documentsPop.size(); j++) {
				Document doc1 = documentsPop.get(i);
				Document doc2 = documentsPop.get(j);
				System.out.println("\nComparing " + doc1 + " and " + doc2);
				cosineSumPop += vectorSpacePop.cosineSimilarity(doc1, doc2);
				System.out.println(vectorSpacePop.cosineSimilarity(doc1, doc2));
				numPairs++;
				
			}
		}
		
		Double averageCosineSumPop = cosineSumPop / numPairs;
		System.out.println("Average Cosine Similarity (Pop): " + averageCosineSumPop);
		
		//Average cosine sumilarity of top 10 hip hop songs =================================
		Corpus corpusHipHop = new Corpus(documentsHipHop);
		
		VectorSpaceModel vectorSpaceHipHop = new VectorSpaceModel(corpusHipHop);
		
		Double cosineSumHipHop = 0.0;
		
		
		for (int i = 0; i < documentsHipHop.size(); i++) {
			for (int j = i + 1; j < documentsHipHop.size(); j++) {
				Document doc1 = documentsHipHop.get(i);
				Document doc2 = documentsHipHop.get(j);
				System.out.println("\nComparing " + doc1 + " and " + doc2);
				cosineSumHipHop += vectorSpaceHipHop.cosineSimilarity(doc1, doc2);
				System.out.println(vectorSpaceHipHop.cosineSimilarity(doc1, doc2));
				
			}
		}
		
		Double averageCosineSumHipHop = cosineSumHipHop / numPairs;
		System.out.println("Average Cosine Similarity (Hip hop): " + averageCosineSumHipHop);
		
		//Average cosine sumilarity of top 10 country songs =================================
		Corpus corpusCountry = new Corpus(documentsCountry);
		
		VectorSpaceModel vectorSpaceCountry = new VectorSpaceModel(corpusCountry);
		
		Double cosineSumCountry = 0.0;
		
		for (int i = 0; i < documentsCountry.size(); i++) {
			for (int j = i + 1; j < documentsCountry.size(); j++) {
				Document doc1 = documentsCountry.get(i);
				Document doc2 = documentsCountry.get(j);
				System.out.println("\nComparing " + doc1 + " and " + doc2);
				cosineSumCountry += vectorSpaceCountry.cosineSimilarity(doc1, doc2);
				System.out.println(vectorSpaceCountry.cosineSimilarity(doc1, doc2));
				
			}
		}
		
		Double averageCosineSumCountry = cosineSumCountry/ numPairs;
		System.out.println("Average Cosine Similarity (Country): " + averageCosineSumCountry);
		
		
		

		
	}

}
