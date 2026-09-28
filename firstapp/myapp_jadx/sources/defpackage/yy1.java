package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yy1<T> {
    public final psm a;
    public final w9e b;
    public final mpe0 c;
    public final mpe0 d;

    public static final /* synthetic */ class a extends pf implements gaj<T, UiText, v1b<? super UiText>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(Object obj, UiText uiText, v1b<? super UiText> v1bVar) {
            return ((yy1) this.a).a(obj, uiText);
        }
    }

    public yy1(psm psmVar, w9e w9eVar) {
        psmVar.getClass();
        w9eVar.getClass();
        this.a = psmVar;
        this.b = w9eVar;
        int i = 0;
        this.c = hwr.b(new wy1(this, i));
        this.d = hwr.b(new xy1(this, i));
    }

    public abstract UiText a(T t, UiText uiText);

    public abstract Object b(Integer num, x1b x1bVar);

    public abstract wwd0 c();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, String str2, String str3, x1b x1bVar) {
        zy1 zy1Var;
        ztw ztwVar;
        if (x1bVar instanceof zy1) {
            zy1Var = (zy1) x1bVar;
            int i = zy1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zy1Var.d = i - Integer.MIN_VALUE;
            } else {
                zy1Var = new zy1(this, x1bVar);
            }
        } else {
            zy1Var = new zy1(this, x1bVar);
        }
        Object objB = zy1Var.b;
        Object obj = y5b.a;
        int i2 = zy1Var.d;
        if (i2 == 0) {
            uj50.b(objB);
            w9e w9eVar = this.b;
            w9eVar.getClass();
            str2.getClass();
            ej5.c(w9eVar.a(), null, null, new bae(w9eVar, str3, null), 3);
            ej5.c(w9eVar.a(), null, null, new cae(w9eVar, str2, null), 3);
            if (!((Boolean) this.c.getValue()).booleanValue()) {
                return Unit.a;
            }
            ztw ztwVarC = c();
            Integer intOrNull = StringsKt.toIntOrNull(str);
            zy1Var.a = ztwVarC;
            zy1Var.d = 1;
            objB = b(intOrNull, zy1Var);
            if (objB != obj) {
                ztwVar = ztwVarC;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objB);
                return objB;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ztw ztwVar2 = zy1Var.a;
        uj50.b(objB);
        ztwVar = ztwVar2;
        zy1Var.a = null;
        zy1Var.d = 2;
        Object objEmit = ztwVar.emit(objB, zy1Var);
        return objEmit == obj ? obj : objEmit;
    }
}
