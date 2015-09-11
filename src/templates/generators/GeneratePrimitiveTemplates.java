package templates.generators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import templates.PrimitiveTemplateGenCode;
import codeTemplate.ClassTemplate;
import codeTemplate.primitiveTemplate.PrimitiveTypeTemplate;
import codeTemplate.render.TemplateRenders;

/**
 * @author TeamworkGuy2
 * @since 2015-8-24
 */
public class GeneratePrimitiveTemplates {

	public static class PrimitiveTemplatesTmpl extends ClassTemplate {
		public List<PrimitiveTemplateGenCode> types;
	}


	private static List<PrimitiveTemplateGenCode> getGenTypes() {
		List<PrimitiveTemplateGenCode> res = new ArrayList<>();

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Boolean.TYPE), Arrays.asList(
			"setTypeInfo(t, JavaPrimitives.BOOLEAN);",
			"t.setDefaultValue(\"false\");",
			"t.setAggregatable(false);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Byte.TYPE), Arrays.asList(
				"t.setAverageType(\"float\");",
				"t.setDefaultValue(\"(byte)0\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Byte.MAX_VALUE\");",
				"t.setMinValue(\"Byte.MIN_VALUE\");",
				"t.setSumType(\"int\");",
				"setTypeInfo(t, JavaPrimitives.BYTE);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Short.TYPE), Arrays.asList(
				"t.setAverageType(\"float\");",
				"t.setDefaultValue(\"(short)0\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Short.MAX_VALUE\");",
				"t.setMinValue(\"Short.MIN_VALUE\");",
				"t.setSumType(\"int\");",
				"setTypeInfo(t, JavaPrimitives.SHORT);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Character.TYPE), Arrays.asList(
				"t.setAverageType(\"float\");",
				"t.setDefaultValue(\"(char)0\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Character.MAX_VALUE\");",
				"t.setMinValue(\"Character.MIN_VALUE\");",
				"t.setSumType(\"int\");",
				"setTypeInfo(t, JavaPrimitives.CHAR);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Integer.TYPE), Arrays.asList(
				"t.setAverageType(\"float\");",
				"t.setDefaultValue(\"0\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Integer.MAX_VALUE\");",
				"t.setMinValue(\"Integer.MIN_VALUE\");",
				"t.setSumType(\"int\");",
				"setTypeInfo(t, JavaPrimitives.INT);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Float.TYPE), Arrays.asList(
				"t.setAverageType(\"float\");",
				"t.setDefaultValue(\"0f\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Float.MAX_VALUE\");",
				"t.setMinValue(\"Float.MIN_VALUE\");",
				"t.setSumType(\"float\");",
				"setTypeInfo(t, JavaPrimitives.FLOAT);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Long.TYPE), Arrays.asList(
				"t.setAverageType(\"double\");",
				"t.setDefaultValue(\"0L\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Long.MAX_VALUE\");",
				"t.setMinValue(\"Long.MIN_VALUE\");",
				"t.setSumType(\"long\");",
				"setTypeInfo(t, JavaPrimitives.LONG);"
		)));

		res.add(new PrimitiveTemplateGenCode(new PrimitiveTypeTemplate(Double.TYPE), Arrays.asList(
				"t.setAverageType(\"double\");",
				"t.setDefaultValue(\"0\");",
				"t.setAggregatable(true);",
				"t.setMaxValue(\"Double.MAX_VALUE\");",
				"t.setMinValue(\"Double.MIN_VALUE\");",
				"t.setSumType(\"double\");",
				"setTypeInfo(t, JavaPrimitives.DOUBLE);"
		)));

		return res;
	}


	public static void generatePrimitiveTemplates() {
		PrimitiveTemplatesTmpl tmpl = new PrimitiveTemplatesTmpl();
		tmpl.className = "PrimitiveTemplates";
		tmpl.packageName = "codeTemplate";
		tmpl.types = getGenTypes();
		TemplateRenders.renderClassTemplate("src/templates/TPrimitiveTemplates.stg", "TPrimitiveTemplates", tmpl);
	}


	public static void main(String[] args) {
		generatePrimitiveTemplates();
	}

}