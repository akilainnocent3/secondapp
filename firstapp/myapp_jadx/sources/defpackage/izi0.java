package defpackage;

/* JADX INFO: loaded from: classes7.dex */
public enum izi0 implements xag<String> {
    /* JADX INFO: Fake field, exist only in values array */
    Enable("enable"),
    Finish("FINISH"),
    /* JADX INFO: Fake field, exist only in values array */
    SurveyCompleted("SURVEY_COMPLETED"),
    ToMultiFactorAuth("TO_MULTI_FACTOR_AUTH");

    public final String a;

    izi0(String str) {
        this.a = str;
    }

    @Override // defpackage.xag
    public final String getValue() {
        return this.a;
    }
}
