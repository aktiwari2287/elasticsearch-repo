package com.javatechie.es.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;

@Document(indexName="meditouch",type="practice",shards=2)
@Data
public class Practice {

	@Id
	private String practiceid;

	private int businessid;

	private String practicename;

	private String contactlastname;

	private String contactfirstname;

	private int personisprovider;

	private String practicetaxid;

	private int taxidisprovider;

	private String practicemgtsystem;

	private String visits;

	private int noofproviders;

	private String heardaboutfrom;

	private String emailwork;

	private String emailhome;

	private String emailother;

	private String datecreated;

	private int active;

	private String oldemail;

	private int batchid;

	private String npi;

	private String npiisprovider;

	private int sentpayerrejectemail;

	private int institutional;

	private int professional;

	private String imagefilename;

	private String logoutlink;

	private String gs02;

	private String isa06;

	private String ehrdocemail;

	private String ehrdocemailpassword;

	private String ehrdocfaxnumber;

	private String chargeupdated;

	private String pppremiumfeatures;

	private int listenvitals;

	private String myfaxuserid;

	private String pplogoutlink;

	private String enablespecialprinting;

	private String ehrcobranding;

	private String financialentity;

	private String awsstoreid;

	private String evisitcharge;

	private String evisitdisclaimer;

	private String practicerateid;

	private String donotimportcustomforms;

	private String fsrfilename;

	private int pin;

	private String emergencyenableddate;

	private String salesforceaccountid;

	private String sfsynchdate;

	private String parentsalesforceid;

	private String pppatientmessaging;

	private String deactivedate;

	private String demoaccount;

	private String democcareuserid;

	private String mgmaflag;

	private String autoeligproviderid;

	private int refprovtosupprov;

	private String claimidprefix;

	private int groupreportingenabled;
}
