package org.oneedtech.inspect.tcp.vc.schema;

import static org.oneedtech.inspect.schema.SchemaType.JSON;

import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;
import org.oneedtech.inspect.schema.Catalog;
import org.oneedtech.inspect.schema.JsonSchemaMapper;
import org.oneedtech.inspect.schema.SchemaKey;
import org.oneedtech.inspect.schema.SchemaType;

public class TCPCatalog extends Catalog {

  /** HR TCP */
  public static final SchemaKey TCP_VC_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/VerifiableCredentialLER-RSType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/VerifiableCredentialLER-RSType.json")
          .build();

  public static final SchemaKey TCP_CANDIDATE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/CandidateType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/CandidateType.json")
          .build();

  public static final SchemaKey TCP_JOB_POSTING_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/JobPostingType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/JobPostingType.json")
          .build();

  public static final SchemaKey TCP_LER_RS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/LER-RSType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/LER-RSType.json")
          .build();

  public static final SchemaKey TCP_POSITION_OPENING_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/PositionOpeningType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/PositionOpeningType.json")
          .build();

  public static final SchemaKey TCP_POSITION_PROFILE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/PositionProfileType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/PositionProfileType.json")
          .build();

  public static final SchemaKey TCP_RECRUITING_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/RecruitingType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/RecruitingType.json")
          .build();

  public static final SchemaKey TCP_APPROVAL_STATUS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/codelist/ApprovalStatusCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/codelist/ApprovalStatusCodeList.json")
          .build();

  public static final SchemaKey TCP_CANDIDATE_RELATIONSHIP_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/codelist/CandidateRelationshipCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/codelist/CandidateRelationshipCodeList.json")
          .build();

  public static final SchemaKey TCP_POSTING_REQUESTER_ROLE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/codelist/PostingRequesterRoleCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/codelist/PostingRequesterRoleCodeList.json")
          .build();

  public static final SchemaKey TCP_RECRUITING_DOCUMENT_STATUS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/codelist/RecruitingDocumentStatusCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/codelist/RecruitingDocumentStatusCodeList.json")
          .build();

  public static final SchemaKey TCP_EMPLOYER_PREFERENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/common/EmployerPreferenceType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/common/EmployerPreferenceType.json")
          .build();

  public static final SchemaKey TCP_POSITION_PREFERENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/common/PositionPreferenceType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/common/PositionPreferenceType.json")
          .build();

  public static final SchemaKey TCP_RELOCATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/common/RelocationType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/common/RelocationType.json")
          .build();

  public static final SchemaKey TCP_REMOTE_WORK_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/common/RemoteWorkType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/common/RemoteWorkType.json")
          .build();

  public static final SchemaKey TCP_TRAVEL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/common/TravelType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/common/TravelType.json")
          .build();

  public static final SchemaKey TCP_ANNOTATED_DEFINED_TERM_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/AnnotatedDefinedTermType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/AnnotatedDefinedTermType.json")
          .build();

  public static final SchemaKey TCP_ASSESSMENT_PROFILE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/AssessmentProfileType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/AssessmentProfileType.json")
          .build();

  public static final SchemaKey TCP_CONDITION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/ConditionType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/ConditionType.json")
          .build();

  public static final SchemaKey TCP_CONTACT_POINT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/ContactPointType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/ContactPointType.json")
          .build();

  public static final SchemaKey TCP_CREDENTIAL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/CredentialType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/CredentialType.json")
          .build();

  public static final SchemaKey TCP_DEFINED_TERM_SET_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/DefinedTermSetType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/DefinedTermSetType.json")
          .build();

  public static final SchemaKey TCP_JDX_ORGANIZATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/JDXOrganizationType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/JDXOrganizationType.json")
          .build();

  public static final SchemaKey TCP_JOB_DESCRIPTION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/JobDescriptionType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/JobDescriptionType.json")
          .build();

  public static final SchemaKey TCP_MONETARY_AMOUNT_DISTRIBUTION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/jdx/MonetaryAmountDistributionType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/jdx/MonetaryAmountDistributionType.json")
          .build();

  public static final SchemaKey TCP_MONETARY_AMOUNT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/MonetaryAmountType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/MonetaryAmountType.json")
          .build();

  public static final SchemaKey TCP_PLACE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/PlaceType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/PlaceType.json")
          .build();

  public static final SchemaKey TCP_POSTAL_ADDRESS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/PostalAddressType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/PostalAddressType.json")
          .build();

  public static final SchemaKey TCP_POSTING_INSTRUCTIONS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/PostingInstructionsType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/PostingInstructionsType.json")
          .build();

  public static final SchemaKey TCP_PROPERTY_VALUE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/PropertyValueType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/PropertyValueType.json")
          .build();

  public static final SchemaKey TCP_QUALIFYING_EXPERIENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/QualifyingExperienceType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/QualifyingExperienceType.json")
          .build();

  public static final SchemaKey TCP_QUANTITATIVE_VALUE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/QuantitativeValueType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/QuantitativeValueType.json")
          .build();

  public static final SchemaKey TCP_SCALE_ANNOTATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/jdx/ScaleAnnotationType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/jdx/ScaleAnnotationType.json")
          .build();

  public static final SchemaKey TCP_CLR_20_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/1EdTech/clr_v2p0_clrcredential_schema_draft4.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/1EdTech/clr_v2p0_clrcredential_schema_draft4.json")
          .build();

  public static final SchemaKey TCP_OB_30_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/1EdTech/ob_v3p0_achievementcredential_schema_draft4.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/1EdTech/ob_v3p0_achievementcredential_schema_draft4.json")
          .build();

  public static final SchemaKey TCP_ENDORSER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/EndorserType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/EndorserType.json")
          .build();

  public static final SchemaKey TCP_NAME_VALUE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/NameValueType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/NameValueType.json")
          .build();

  public static final SchemaKey TCP_NARRATIVE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/NarrativeType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/NarrativeType.json")
          .build();

  public static final SchemaKey TCP_OTHER_VERIFIABLE_CREDENTIAL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/OtherVerifiableCredentialType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/OtherVerifiableCredentialType.json")
          .build();

  public static final SchemaKey TCP_PROVISIONAL_VERIFIABLE_CREDENTIAL_BASE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialBaseType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialBaseType.json")
          .build();

  public static final SchemaKey TCP_PROVISIONAL_VERIFIABLE_CREDENTIAL_CERTIFICATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialCertificationType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialCertificationType.json")
          .build();

  public static final SchemaKey
      TCP_PROVISIONAL_VERIFIABLE_CREDENTIAL_EDUCATION_AND_LEARNING_TYPE_JSON =
          new SchemaKey.Builder()
              .type(JSON)
              .uri(
                  "https://www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialEducationAndLearningType.json")
              .path(
                  "catalog/www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialEducationAndLearningType.json")
              .build();

  public static final SchemaKey TCP_PROVISIONAL_VERIFIABLE_CREDENTIAL_EMPLOYMENT_HISTORY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialEmploymentHistoryType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialEmploymentHistoryType.json")
          .build();

  public static final SchemaKey TCP_PROVISIONAL_VERIFIABLE_CREDENTIAL_LICENSE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialLicenseType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/ProvisionalVerifiableCredentialLicenseType.json")
          .build();

  public static final SchemaKey TCP_REF_SCHEME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/RefSchemeType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/RefSchemeType.json")
          .build();

  public static final SchemaKey TCP_RESUME_PERSON_BASE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/ResumePersonBaseType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/ResumePersonBaseType.json")
          .build();

  public static final SchemaKey TCP_SKILL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/SkillType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/SkillType.json")
          .build();

  public static final SchemaKey TCP_STRING_ARRAY_REF_SCHEME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/StringArrayRefSchemeType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/StringArrayRefSchemeType.json")
          .build();

  public static final SchemaKey TCP_VERIFIABLE_CERTIFICATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/VerifiableCertificationType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerifiableCertificationType.json")
          .build();

  public static final SchemaKey TCP_VERIFIABLE_EDUCATION_ATTENDANCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/VerifiableEducationAttendanceType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerifiableEducationAttendanceType.json")
          .build();

  public static final SchemaKey TCP_VERIFIABLE_EMPLOYMENT_HISTORY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/VerifiableEmploymentHistoryType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerifiableEmploymentHistoryType.json")
          .build();

  public static final SchemaKey TCP_VERIFIABLE_LICENSE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/VerifiableLicenseType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerifiableLicenseType.json")
          .build();

  public static final SchemaKey TCP_VERIFIABLE_SKILL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/VerifiableSkillType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerifiableSkillType.json")
          .build();

  public static final SchemaKey TCP_VERIFICATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/recruiting/json/ler-rs/VerificationType.json")
          .path("catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerificationType.json")
          .build();

  public static final SchemaKey TCP_VERIFYING_ORGANIZATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/recruiting/json/ler-rs/VerifyingOrganizationType.json")
          .path(
              "catalog/www.hropenstandards.org/recruiting/json/ler-rs/VerifyingOrganizationType.json")
          .build();

  /* COMMON JSON SCHEMAS */
  public static final SchemaKey TCP_COMMON_PARENT_ORGANIZATION_REFERENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/ParentOrganizationReferenceType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/ParentOrganizationReferenceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ESTABLISHMENT_ACTIVITY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/EstablishmentActivityType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/EstablishmentActivityType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORGANIZATION_REFERENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/OrganizationReferenceType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/OrganizationReferenceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORGANIZATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/organization/OrganizationType.json")
          .path("catalog/www.hropenstandards.org/common/json/organization/OrganizationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_LOCATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/organization/WorkLocationType.json")
          .path("catalog/www.hropenstandards.org/common/json/organization/WorkLocationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_EMPLOYER_ESTABLISHMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/EmployerEstablishmentType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/EmployerEstablishmentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORGANIZATION_NOUN_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/organization/OrganizationNounType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/OrganizationNounType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PARTY_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/organization/PartyInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/organization/PartyInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORGANIZATION_KEY_STAKEHOLDER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/OrganizationKeyStakeholderType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/OrganizationKeyStakeholderType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORGANIZATION_ACTIVITY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/OrganizationActivityType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/OrganizationActivityType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PARTY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/organization/PartyType.json")
          .path("catalog/www.hropenstandards.org/common/json/organization/PartyType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORGANIZATION_CONTACT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/organization/OrganizationContactType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/organization/OrganizationContactType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMPETENCY_DIMENSION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/competency/CompetencyDimensionType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/competency/CompetencyDimensionType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMPETENCY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/competency/CompetencyType.json")
          .path("catalog/www.hropenstandards.org/common/json/competency/CompetencyType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SPECIFIED_COMPETENCY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/competency/SpecifiedCompetencyType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/competency/SpecifiedCompetencyType.json")
          .build();

  public static final SchemaKey TCP_COMMON_REQUIRED_COMPETENCY_EVIDENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/competency/RequiredCompetencyEvidenceType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/competency/RequiredCompetencyEvidenceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_COMPETENCY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/competency/PersonCompetencyType.json")
          .path("catalog/www.hropenstandards.org/common/json/competency/PersonCompetencyType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMPETENCY_WEIGHT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/competency/CompetencyWeightType.json")
          .path("catalog/www.hropenstandards.org/common/json/competency/CompetencyWeightType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMPETENCY_EVIDENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/competency/CompetencyEvidenceType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/competency/CompetencyEvidenceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_POSITION_COMPETENCY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/competency/PositionCompetencyType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/competency/PositionCompetencyType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ARGUMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/ArgumentType.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/ArgumentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_MESSAGE_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/MessageInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/MessageInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_RESOURCE_MESSAGE_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/ResourceMessageInclusion.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/messages/ResourceMessageInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_CONFIRM_MESSAGE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/ConfirmMessageType.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/ConfirmMessageType.json")
          .build();

  public static final SchemaKey TCP_COMMON_MESSAGE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/MessageType.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/MessageType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RESPONSE_MESSAGE_BASE_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/messages/ResponseMessageBaseInclusion.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/messages/ResponseMessageBaseInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_BULK_RESPONSE_MESSAGE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/BulkResponseMessageType.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/BulkResponseMessageType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RESULT_STATUS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/ResultStatusCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/ResultStatusCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_MESSAGE_BASE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/messages/MessageBaseType.json")
          .path("catalog/www.hropenstandards.org/common/json/messages/MessageBaseType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ATOMIC_RESPONSE_MESSAGE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/messages/AtomicResponseMessageType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/messages/AtomicResponseMessageType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_PHYSICAL_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonPhysicalInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonPhysicalInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_BASE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonBaseType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonBaseType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_LEGAL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonLegalType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonLegalType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_NAME_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonNameTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonNameTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_NAME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonNameType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonNameType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_LEGAL_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonLegalInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonLegalInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SPECIFIED_PERSON_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/SpecifiedPersonType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/SpecifiedPersonType.json")
          .build();

  public static final SchemaKey TCP_COMMON_LEGAL_DOCUMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/LegalDocumentType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/LegalDocumentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_REFERENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonReferenceType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonReferenceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RESPONSIBLE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/ResponsibleType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/ResponsibleType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PERSON_PHYSICAL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/PersonPhysicalType.json")
          .path("catalog/www.hropenstandards.org/common/json/person/PersonPhysicalType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RESPONSIBLE_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/person/ResponsibleInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/person/ResponsibleInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_PAY_RATE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/PayRateType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/PayRateType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COST_ALLOCATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/CostAllocationType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/CostAllocationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_REMUNERATION_OR_DEDUCTION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/RemunerationOrDeductionType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/RemunerationOrDeductionType.json")
          .build();

  public static final SchemaKey TCP_COMMON_REMUNERATION_PACKAGE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/RemunerationPackageType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/RemunerationPackageType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_ALLOCATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/WorkAllocationType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/WorkAllocationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PAYMENT_METHOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/PaymentMethodType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/PaymentMethodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_REMUNERATION_RANGE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/RemunerationRangeType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/RemunerationRangeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_DIRECT_COMPENSATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/pay/DirectCompensationType.json")
          .path("catalog/www.hropenstandards.org/common/json/pay/DirectCompensationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_META_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/meta/MetaType.json")
          .path("catalog/www.hropenstandards.org/common/json/meta/MetaType.json")
          .build();

  public static final SchemaKey TCP_COMMON_V4_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/meta/v4.json")
          .path("catalog/www.hropenstandards.org/common/json/meta/v4.json")
          .build();

  public static final SchemaKey TCP_COMMON_HYPER4_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/meta/hyper4.json")
          .path("catalog/www.hropenstandards.org/common/json/meta/hyper4.json")
          .build();

  public static final SchemaKey TCP_COMMON_HROS_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/meta/hros.json")
          .path("catalog/www.hropenstandards.org/common/json/meta/hros.json")
          .build();

  public static final SchemaKey TCP_COMMON_PATCH_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/meta/patch.json")
          .path("catalog/www.hropenstandards.org/common/json/meta/patch.json")
          .build();

  public static final SchemaKey TCP_COMMON_SEARCH_ORDER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/SearchOrderType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/SearchOrderType.json")
          .build();

  public static final SchemaKey TCP_COMMON_GEO_DISTANCE_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/GeoDistanceQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/GeoDistanceQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SEARCH_CRITERION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/SearchCriterionType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/SearchCriterionType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SCORE_THRESHOLD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/ScoreThresholdType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/ScoreThresholdType.json")
          .build();

  public static final SchemaKey TCP_COMMON_NESTED_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/NestedQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/NestedQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RANGE_NUMBER_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/RangeNumberQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/RangeNumberQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WEIGHT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/WeightType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/WeightType.json")
          .build();

  public static final SchemaKey TCP_COMMON_REFERENCED_PROPERTY_VALUE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/search/ReferencedPropertyValueType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/search/ReferencedPropertyValueType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BOOLEAN_AND_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/BooleanAndQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/BooleanAndQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BOOLEAN_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/BooleanQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/BooleanQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_TERMS_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/TermsQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/TermsQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_FULLTEXT_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/FulltextQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/FulltextQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RANGE_DATE_TIME_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/RangeDateTimeQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/RangeDateTimeQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_REQUESTED_MATCHED_OBJECT_DESCRIPTOR_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/search/RequestedMatchedObjectDescriptorType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/search/RequestedMatchedObjectDescriptorType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PARAMETER_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/ParameterTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/search/ParameterTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_LEAF_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/LeafQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/LeafQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_RANGE_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/RangeQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/RangeQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SEARCH_DOCUMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/SearchDocumentType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/SearchDocumentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_GEO_POLYGON_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/GeoPolygonQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/GeoPolygonQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_GEO_POLYGON_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/GeoPolygonType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/GeoPolygonType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BOOLEAN_OR_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/BooleanOrQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/BooleanOrQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PARAMETER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/ParameterType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/ParameterType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BOOLEAN_NOT_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/BooleanNotQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/BooleanNotQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SEARCH_RESULT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/SearchResultType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/SearchResultType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ALL_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/AllQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/AllQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_ORDER_CRITERION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/OrderCriterionType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/OrderCriterionType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SEARCH_LIMIT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/SearchLimitType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/SearchLimitType.json")
          .build();

  public static final SchemaKey TCP_COMMON_SEARCH_QUERY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/search/SearchQueryType.json")
          .path("catalog/www.hropenstandards.org/common/json/search/SearchQueryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_ORGANIZATION_AFFILIATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/profile/OrganizationAffiliationType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/profile/OrganizationAffiliationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_PUBLICATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/PublicationType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/PublicationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_EVENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/EventType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/EventType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_LICENSE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/LicenseType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/LicenseType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_PATENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/PatentType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/PatentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_BASE_HISTORY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/BaseHistoryType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/BaseHistoryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_PERSON_PROFILE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/PersonProfileType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/PersonProfileType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_CERTIFICATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/CertificationType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/CertificationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_REFEREE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/RefereeType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/RefereeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_MILITARY_SERVICE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/MilitaryServiceType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/MilitaryServiceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_EMPLOYER_HISTORY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/EmployerHistoryType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/EmployerHistoryType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_EDUCATION_ATTENDANCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/EducationAttendanceType.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/EducationAttendanceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_PROFILE_PERSON_PROFILE_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/profile/PersonProfileInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/profile/PersonProfileInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_RESOURCE_CLASSIFICATION_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/work/ResourceClassificationInclusion.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/work/ResourceClassificationInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORK_RELATIONSHIP_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkRelationshipType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkRelationshipType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_EMPLOYMENT_PERMIT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/EmploymentPermitType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/EmploymentPermitType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_SCHEDULE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/ScheduleType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/ScheduleType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORKER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkerType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkerType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_POSITION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/PositionType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/PositionType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_TRAINING_RELATIONSHIP_STATUS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/work/TrainingRelationshipStatusType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/work/TrainingRelationshipStatusType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORK_AGREEMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkAgreementType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkAgreementType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORK_RELATIONSHIP_STATUS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkRelationshipStatusType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkRelationshipStatusType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_TRAINING_AGREEMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/TrainingAgreementType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/TrainingAgreementType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORK_LIFE_CYCLE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkLifeCycleType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkLifeCycleType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_JOB_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/JobType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/JobType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_ASSIGNMENT_LIFE_CYCLE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/AssignmentLifeCycleType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/AssignmentLifeCycleType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_DEPLOYMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/DeploymentType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/DeploymentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_DISABILITY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/DisabilityType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/DisabilityType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_EMPLOYEE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/EmployeeType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/EmployeeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORK_ASSIGNMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkAssignmentType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkAssignmentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_STAFFING_REFERENCE_IDS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/StaffingReferenceIdsType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/StaffingReferenceIdsType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORKER_NOUN_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkerNounType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkerNounType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_TRAINEE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/TraineeType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/TraineeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_WORK_ASSIGNMENT_STATUS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/WorkAssignmentStatusType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/WorkAssignmentStatusType.json")
          .build();

  public static final SchemaKey TCP_COMMON_WORK_TRAINING_RELATIONSHIP_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/work/TrainingRelationshipType.json")
          .path("catalog/www.hropenstandards.org/common/json/work/TrainingRelationshipType.json")
          .build();

  public static final SchemaKey TCP_COMMON_EVALUATION_SCORE_TEXT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/evaluation/ScoreTextType.json")
          .path("catalog/www.hropenstandards.org/common/json/evaluation/ScoreTextType.json")
          .build();

  public static final SchemaKey TCP_COMMON_EVALUATION_BASE_SCORE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/evaluation/BaseScoreType.json")
          .path("catalog/www.hropenstandards.org/common/json/evaluation/BaseScoreType.json")
          .build();

  public static final SchemaKey TCP_COMMON_EVALUATION_SCORE_NUMERIC_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/evaluation/ScoreNumericType.json")
          .path("catalog/www.hropenstandards.org/common/json/evaluation/ScoreNumericType.json")
          .build();

  public static final SchemaKey TCP_COMMON_EVALUATION_SCORE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/evaluation/ScoreType.json")
          .path("catalog/www.hropenstandards.org/common/json/evaluation/ScoreType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_LOCATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/LocationType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/LocationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_ADDRESS_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/AddressTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/AddressTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_SOCIAL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/SocialType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/SocialType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_EMAIL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/EmailType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/EmailType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_ADDRESS_COMPONENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/communication/AddressComponentType.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/communication/AddressComponentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_SOCIAL_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/SocialTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/SocialTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_PHONE_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/PhoneTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/PhoneTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_PHONE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/PhoneType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/PhoneType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_COMMUNICATION_ITEM_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/communication/CommunicationItemInclusion.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/communication/CommunicationItemInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_JURISDICTION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/JurisdictionType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/JurisdictionType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_COMMUNICATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/CommunicationType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/CommunicationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_EMAIL_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/EmailTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/EmailTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_WEB_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/WebTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/WebTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_ADDRESS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/AddressType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/AddressType.json")
          .build();

  public static final SchemaKey TCP_COMMON_COMMUNICATION_WEB_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/communication/WebType.json")
          .path("catalog/www.hropenstandards.org/common/json/communication/WebType.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WORK_LOCATION_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/WorkLocationCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/WorkLocationCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_POSITION_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PositionTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/PositionTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_COMPETENCY_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/CompetencyTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/CompetencyTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_ACTION_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/ActionCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/ActionCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WORK_TERM_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/WorkTermTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/WorkTermTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_GENDER_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/GenderCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/GenderCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_LEGAL_ORGANIZATION_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/LegalOrganizationTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/LegalOrganizationTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WORK_ASSIGNMENT_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/WorkAssignmentTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/WorkAssignmentTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_AFFILIATED_ORGANIZATION_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/AffiliatedOrganizationTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/AffiliatedOrganizationTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_EDUCATION_DEGREE_GRANTED_STATUS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/EducationDegreeGrantedStatusCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/EducationDegreeGrantedStatusCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_OBJECTIVE_ACTION_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/ObjectiveActionCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/ObjectiveActionCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_TIME_OFF_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/TimeOffTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/TimeOffTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_COUNTRY_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/CountryCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/CountryCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WEEKDAY_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/WeekdayCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/WeekdayCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_PAY_CYCLE_INTERVAL_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PayCycleIntervalCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/PayCycleIntervalCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_TRAINING_RELATIONSHIP_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/TrainingRelationshipTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/TrainingRelationshipTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WORK_RELATIONSHIP_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/WorkRelationshipTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/WorkRelationshipTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_PUBLICATION_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PublicationTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/PublicationTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_SCHEDULED_HOURS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/ScheduledHoursCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/ScheduledHoursCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_POSITION_TERM_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PositionTermTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/PositionTermTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_TIME_OFFSET_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/TimeOffsetList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/TimeOffsetList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_AGENCY_ROLE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/AgencyRoleCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/AgencyRoleCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WORKER_ASSIGNMENT_SOURCE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/WorkerAssignmentSourceCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/WorkerAssignmentSourceCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_CURRENCY_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/CurrencyCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/CurrencyCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_UNIT_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/UnitCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/UnitCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_RELATIONSHIP_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/RelationshipTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/RelationshipTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_REMUNERATION_BASIS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/RemunerationBasisCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/RemunerationBasisCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_WORKER_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/WorkerTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/WorkerTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_ASSIGNMENT_REASON_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/AssignmentReasonCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/AssignmentReasonCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_RESOURCE_RELATIONSHIP_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/ResourceRelationshipCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/ResourceRelationshipCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_POSITION_SCHEDULE_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/PositionScheduleTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/PositionScheduleTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_PAY_RATE_INTERVAL_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PayRateIntervalCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/PayRateIntervalCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_CAREER_LEVEL_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/CareerLevelCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/CareerLevelCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_TRAINEE_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/TraineeTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/TraineeTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_PAY_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PayTypeCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/PayTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_LEGAL_ORGANIZATION_UNIT_TYPE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/LegalOrganizationUnitTypeCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/LegalOrganizationUnitTypeCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_COMPENSATION_CAREER_LEVEL_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/codelist/CompensationCareerLevelCodeList.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/codelist/CompensationCareerLevelCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_ISCED_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/IscedCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/IscedCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_SCORE_NUMERIC_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/ScoreNumericCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/ScoreNumericCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_LANGUAGE_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/LanguageCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/LanguageCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_CODELIST_PATENT_STATUS_CODE_LIST_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/codelist/PatentStatusCodeList.json")
          .path("catalog/www.hropenstandards.org/common/json/codelist/PatentStatusCodeList.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_TEXT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/TextType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/TextType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ATTACHMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/AttachmentType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/AttachmentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_LOCALIZATION_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/LocalizationInclusion.json")
          .path("catalog/www.hropenstandards.org/common/json/base/LocalizationInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_YEAR_MONTH_OPEN_END_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/YearMonthOpenEndPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/YearMonthOpenEndPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ISSUER_CODE_LIST_CODE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/IssuerCodeListCodeType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/IssuerCodeListCodeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_COMMENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/CommentType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/CommentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_MEASURE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/MeasureType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/MeasureType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_YEAR_MONTH_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/YearMonthType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/YearMonthType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_MONTH_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/MonthType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/MonthType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_SIMPLE_TEXT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/SimpleTextType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/SimpleTextType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_CODE_LIST_CODE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/CodeListCodeType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/CodeListCodeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_YEAR_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/YearPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/YearPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_TIME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/TimeType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/TimeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_PERCENT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/PercentType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/PercentType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATE_OPEN_END_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DateOpenEndPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DateOpenEndPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATE_TIME_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DateTimePeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DateTimePeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_POSITIVE_INTEGER_NUMBER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/PositiveIntegerNumberType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/PositiveIntegerNumberType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_NAME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/NameType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/NameType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DateType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DateType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_OPEN_END_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/OpenEndPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/OpenEndPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_AMOUNT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/AmountType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/AmountType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_GEO_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/GeoType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/GeoType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_URI_IDENTIFIER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/UriIdentifierType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/UriIdentifierType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_INDICATOR_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/IndicatorType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/IndicatorType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_RATE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/RateType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/RateType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_CODE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/CodeType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/CodeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_YEAR_OPEN_END_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/YearOpenEndPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/YearOpenEndPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATE_TIME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DateTimeType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DateTimeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ENTITY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/EntityType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/EntityType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_STATUS_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/StatusType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/StatusType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATE_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DatePeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DatePeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATA_PROTECTION_POLICY_INCLUSION_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri(
              "https://www.hropenstandards.org/common/json/base/DataProtectionPolicyInclusion.json")
          .path(
              "catalog/www.hropenstandards.org/common/json/base/DataProtectionPolicyInclusion.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_NOUN_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/NounType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/NounType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_YEAR_MONTH_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/YearMonthPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/YearMonthPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_IDENTIFIER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/IdentifierType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/IdentifierType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_EFFECTIVE_TIME_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/EffectiveTimePeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/EffectiveTimePeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DAY_OF_MONTH_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DayOfMonthType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DayOfMonthType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_YEAR_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/YearType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/YearType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_LINK_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/LinkType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/LinkType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ATTACHMENT_REFERENCE_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/AttachmentReferenceType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/AttachmentReferenceType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_RATIO_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/RatioType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/RatioType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_STRING_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/StringTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/base/StringTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/PeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/PeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ISSUER_IDENTIFIER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/IssuerIdentifierType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/IssuerIdentifierType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_SIMPLE_IDENTIFIER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/SimpleIdentifierType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/SimpleIdentifierType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ID_GROUP_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/IdGroupType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/IdGroupType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_BINARY_OBJECT_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/BinaryObjectType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/BinaryObjectType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DATE_TIME_OPEN_END_PERIOD_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DateTimeOpenEndPeriodType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DateTimeOpenEndPeriodType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_TEXT_TYPE_ARRAY_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/TextTypeArray.json")
          .path("catalog/www.hropenstandards.org/common/json/base/TextTypeArray.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_DURATION_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/DurationType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/DurationType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_NUMBER_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/NumberType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/NumberType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_QUANTITY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/QuantityType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/QuantityType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_FORMATTED_DATE_TIME_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/FormattedDateTimeType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/FormattedDateTimeType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_ORDINAL_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/base/OrdinalType.json")
          .path("catalog/www.hropenstandards.org/common/json/base/OrdinalType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_PROCESS_HISTORY_ITEM_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/process/ProcessHistoryItemType.json")
          .path("catalog/www.hropenstandards.org/common/json/process/ProcessHistoryItemType.json")
          .build();

  public static final SchemaKey TCP_COMMON_BASE_PROCESS_HISTORY_TYPE_JSON =
      new SchemaKey.Builder()
          .type(JSON)
          .uri("https://www.hropenstandards.org/common/json/process/ProcessHistoryType.json")
          .path("catalog/www.hropenstandards.org/common/json/process/ProcessHistoryType.json")
          .build();

  private static final Set<SchemaKey> _all = new HashSet<>();

  static {
    Field[] fields = TCPCatalog.class.getFields();
    for (int i = 0; i < fields.length; i++) {
      Field field = fields[i];
      Object o;
      try {
        o = field.get(null);
      } catch (IllegalArgumentException | IllegalAccessException e) {
        throw new IllegalStateException();
      }
      if (o instanceof SchemaKey) {
        SchemaKey key = (SchemaKey) o;
        _all.add(key);
        if (key.getType() == SchemaType.JSON) {
          JsonSchemaMapper.register(key);
        }
      }
    }
  }

  public static final Set<SchemaKey> ALL = ImmutableSet.<SchemaKey>builder().addAll(_all).build();
}
