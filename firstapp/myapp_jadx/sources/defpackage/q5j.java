package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class q5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ajh ajhVarL1;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                ajh ajhVarL2 = u6jVar.l1();
                if (ajhVarL2 != null) {
                    ajhVarL2.f.setVisibility(0);
                }
                ajh ajhVarL3 = u6jVar.l1();
                if (ajhVarL3 != null) {
                    ConstraintLayout constraintLayout = ajhVarL3.w;
                    ajh ajhVarL4 = u6jVar.l1();
                    if (ajhVarL4 != null) {
                        ajhVarL4.w.setZ(0.0f);
                    }
                    ajh ajhVarL5 = u6jVar.l1();
                    if (ajhVarL5 != null && ajhVarL5.C.indexOfChild(constraintLayout) == -1 && (ajhVarL1 = u6jVar.l1()) != null) {
                        ajhVarL1.C.addView(constraintLayout);
                    }
                }
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.w.B.setVisibility(8);
                }
                djh djhVar2 = u6jVar.b;
                if (djhVar2 != null) {
                    djhVar2.y.e.setAlpha(1.0f);
                }
                djh djhVar3 = u6jVar.b;
                if (djhVar3 == null || djhVar3.G.getVisibility() != 0) {
                    n2j.H0(u6jVar, u6jVar.getContext(), 0.0f, 0.0f, 0.0f, 0.0f, WebSocketProtocol.PAYLOAD_SHORT);
                }
                return Unit.a;
            case 1:
                String str = ((pgx) obj).n;
                if (str != null) {
                    return new Regex(str);
                }
                return null;
            default:
                ((ytw) obj).setValue(Boolean.TRUE);
                return Unit.a;
        }
    }
}
