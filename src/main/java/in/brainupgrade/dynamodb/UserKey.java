package in.brainupgrade.dynamodb;

import java.io.Serializable;
import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@DynamoDBDocument //This annotation is required to specify it is a dynamodb document
@Data
@NoArgsConstructor //this is important
@AllArgsConstructor
public class UserKey implements Serializable {

	@DynamoDBHashKey
	private String email;
	@DynamoDBRangeKey
	private Date accessTime;
}
