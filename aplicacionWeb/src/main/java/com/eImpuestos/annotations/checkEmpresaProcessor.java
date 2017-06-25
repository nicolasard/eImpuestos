package com.eImpuestos.annotations;

@SupportedAnnotationTypes("com.eimpuestos.checkEmpresaAnnotation")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class checkEmpresaProcessor extends AbstractProcessor {
 
    @Override
    public boolean process(Set<? extends TypeElement> annotations, 
      RoundEnvironment roundEnv) {
        return false;
    }
}