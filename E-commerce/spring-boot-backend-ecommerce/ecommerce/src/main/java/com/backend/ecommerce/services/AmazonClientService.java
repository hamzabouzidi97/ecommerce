package com.backend.ecommerce.services;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class AmazonClientService {

	// AmazonS3 Client, in this object you have all AWS API calls about S3.
	private AmazonS3 amazonS3;
	// Your bucket URL, this URL is https://{bucket-name}.s3-{region}.amazonaws.com/
	// If you don't know if your URL is ok, send one file to your bucket using AWS
	// and
	// click on them, the file URL contains your bucket URL.
	@Value("${amazon.s3.endpoint}")
	private String url;
	// Your bucket name.
	@Value("${amazon.s3.bucket-name}")
	private String bucketName;
	// The IAM access key.
	@Value("${amazon.s3.access-key}")
	private String accessKey;
	// The IAM secret key.
	@Value("${amazon.s3.secret-key}")
	private String secretKey;

	// Getters for parents.
//	protected AmazonS3 getClient() {
//		return amazonS3;
//	}

	// This method are called after Spring starts AmazonClientService into your
	// container.
//	@PostConstruct
//	private void init() {
//
//		// Init your AmazonS3 credentials using BasicAWSCredentials.
//		BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);
//
//		// Start the client using AmazonS3ClientBuilder, here we goes to make a standard
//		// cliente, in the
//		// region SA_EAST_2, and the basic credentials.
//		this.amazonS3 = AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_2)
//				.withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
//	}

}
