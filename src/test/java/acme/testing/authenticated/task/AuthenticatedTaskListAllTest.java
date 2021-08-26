package acme.testing.authenticated.task;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import acme.testing.AcmeWorkPlansTest;

public class AuthenticatedTaskListAllTest extends AcmeWorkPlansTest {
	
//	listAll(final int recordIndex, final String title, final String startPeriod, final String endPeriod, final String workload, final String description, final String visibility, final String link):
//  
//           - Caso positivo de la acción list sobre la entidad Task por parte de un usuario
//			   con rol Authenticated (en este caso, el usuario "manager").
//           - El test espera resultados positivos comprobando que las entidades aparecen en el listado y pueden mostrarse con todos sus datos.
//           - Los datos utilizados en el fichero .csv son tasks válidas
	
	@ParameterizedTest
	@CsvFileSource(resources = "/authenticated/task/list-all.csv", encoding = "utf-8", numLinesToSkip = 1)
	@Order(10)
	public void listAll(final int recordIndex, final String title, final String startPeriod, final String endPeriod, final String workload, final String description, final String visibility, final String link) {

		super.signIn("manager", "manager");
		super.clickOnMenu("Authenticated", "Tasks list");

		super.checkColumnHasValue(recordIndex, 0, title);
		super.checkColumnHasValue(recordIndex, 1, startPeriod);
		super.checkColumnHasValue(recordIndex, 2, endPeriod);
		super.checkColumnHasValue(recordIndex, 3, workload);
		
		super.clickOnListingRecord(recordIndex);

		super.checkInputBoxHasValue("title", title);
		super.checkInputBoxHasValue("startExecutionPeriod", startPeriod);
		super.checkInputBoxHasValue("endExecutionPeriod", endPeriod);
		super.checkInputBoxHasValue("workload", workload);
		super.checkInputBoxHasValue("description", description);
		super.checkInputBoxHasValue("share", visibility);
		super.checkInputBoxHasValue("link", link);
		
		super.signOut();

	}
	
}
