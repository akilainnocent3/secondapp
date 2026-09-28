package defpackage;

import com.esotericsoftware.spine.android.b;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class foi implements zi0.b {
    public final /* synthetic */ Function1<Boolean, Unit> a;
    public final /* synthetic */ ytw b;
    public final /* synthetic */ ytw<b> c;

    public foi(Function1 function1, ytw ytwVar, ytw ytwVar2) {
        this.a = function1;
        this.b = ytwVar;
        this.c = ytwVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zi0.b
    public final void a(zi0.e eVar, whg whgVar) {
        lh0 lh0Var;
        String str;
        b value;
        if (whgVar != null) {
            hng hngVar = whgVar.a;
            String str2 = hngVar.a;
            String str3 = hngVar.a;
            str2.getClass();
            if (str2.length() > 0 && Intrinsics.g(str3, "Mid_event (Thigh_head)")) {
                this.a.invoke(Boolean.TRUE);
            }
            if (!Intrinsics.g((String) this.b.getValue(), "ROUND_END_WAIT") || (lh0Var = eVar.a) == null || (str = lh0Var.a) == null) {
                return;
            }
            HashMap<String, do60.a> map = do60.a;
            str3.getClass();
            String strA = do60.a(str, str3);
            ytw<b> ytwVar = this.c;
            b value2 = ytwVar.getValue();
            if (value2 != null) {
                value2.a().m(0, strA, false);
            }
            str3.getClass();
            if (str3.length() <= 0 || Intrinsics.g(str3, "Mid_event (Thigh_head)") || (value = ytwVar.getValue()) == null) {
                return;
            }
            value.a().a(0, "End with ball", false);
        }
    }

    @Override // zi0.b
    public final void b(zi0.e eVar) {
        String str;
        Boolean bool;
        lh0 lh0Var = eVar.a;
        if (lh0Var == null || (str = lh0Var.a) == null) {
            return;
        }
        if (do60.b.contains(str)) {
            bool = Boolean.TRUE;
        } else {
            bool = do60.c.contains(str) ? Boolean.FALSE : null;
        }
        this.a.invoke(bool);
    }

    @Override // zi0.b
    public final void c(zi0.e eVar) {
    }
}
