package pl.edu.wit.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.IOException;

@RequiredArgsConstructor
public class XmlService {
    XmlMapper xmlMapper = new XmlMapper();

    public XmlRoot parseXml(File file) throws IOException {
        return  xmlMapper.readValue(file, XmlRoot.class);
    }
}
