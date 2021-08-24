package management.converters;


import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDateTime;

@Converter(autoApply = true)
public class LocalDateAttributeConverter implements AttributeConverter<LocalDateTime, String> {

    @Override
    public String convertToDatabaseColumn(LocalDateTime attribute) {
        return  attribute == null ? null : attribute.toString();
    }

    @Override
    public LocalDateTime convertToEntityAttribute(String dbData) {
        return dbData == null ? null : LocalDateTime.parse(dbData);
    }
}
