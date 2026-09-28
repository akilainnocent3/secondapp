package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fb4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String string = ((lb4) obj).requireArguments().getString("bio_auth_verify_identity_purpose");
                if (string != null) {
                    return string;
                }
                gc4 gc4Var = gc4.BioTokenEnrollment;
                return "None";
            case 1:
                ((tbw) obj).A1();
                return Unit.a;
            default:
                return (zu00) ((qn70) obj).a(jq40.a(zu00.class), null, null);
        }
    }
}
