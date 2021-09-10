package ass01;

import ass01.docConverter.DocConverter;

import java.util.HashMap;
import java.util.Map;

class WordProcessor{

	private ISpellChecker spellChecker;
	private final Map<String, DocConverter> docConverters;
	private final String fileName;

	public WordProcessor(String fileName){
		this.fileName = fileName;
		docConverters = new HashMap<>();
	}

	public void addDocConverter(DocConverter converter){
		docConverters.put(converter.getExtension(), converter);
	}

	public void convertDocTo(String ext){
		try {
			DocConverter docConverter =  docConverters.get(ext);
			docConverter.save(fileName);
		} catch (Exception e) {
			System.out.println(ext + "파일 형식을 지원하는 DocConverter가 없습니다.");
		}
	}

	public void setSpellChecker(ISpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	public void checkSpelling() {
		spellChecker.check();
	}

}