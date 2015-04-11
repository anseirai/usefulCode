import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
public class SAXXmlParse {

private Map<String, String> parseXML(String xml) throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		// read String
		SAXReader saxreader = new SAXReader();
		Document document = saxreader.read(new ByteArrayInputStream(xml
				.getBytes(CHARACTER_ENCODING)));
		Element root = document.getRootElement();
		@SuppressWarnings("unchecked")
		List<Element> elementList = root.elements();
		for (Element e : elementList) {
			map.put(e.getName(), e.getText());
		}
		
		return map;
	}
} 