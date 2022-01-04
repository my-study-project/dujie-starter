package com.dujie;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseCardQueryBodyBO {

    @XmlElement(name = "medical_card_id")
    private String medicalCardId;

    @XmlElement(name = "medical_card_no")
    private String medicalCardNo;

    @XmlElement(name = "medical_card_validate_date")
    private String medicalCardValidateDate;

    @XmlElement(name = "medical_card_status")
    private String medicalCardStatus;

    @XmlElement(name = "medical_card_type")
    private String medicalCardType;

    @XmlElement(name = "bank_card_no")
    private String bankCardNo;

    @XmlElement(name = "out_user_account")
    private String outUserAccount;

    @XmlElement(name = "out_user_id")
    private String outUserId;

    @XmlElement(name = "out_real_name")
    private String outRealName;

    @XmlElement(name = "out_user_card_type")
    private String outUserCardType;

    @XmlElement(name = "out_user_card_no")
    private String outUserCardNo;

    @XmlElement(name = "out_user_certify_pic")
    private String outUserCertifyPic;

    @XmlElement(name = "social_card_no")
    private String socialCardNo;

    @XmlElement(name = "extend_params")
    private String extendParams;

}