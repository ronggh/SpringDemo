package annotation.config;


import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
    /**
     *
     * @param metadataReader: 扫描到的当前类
     * @param metadataReaderFactory ： 其它类
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取正在扫描类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        // 获取正在扫描类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        // 获取正在扫描类的资源信息，如类路径等
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println(" ***** > " + className);

        // 类名中含有r的返回
        if(className.contains("er")){
            return true;
        }
        return false;
    }
}
