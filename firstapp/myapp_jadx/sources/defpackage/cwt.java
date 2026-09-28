package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes6.dex */
public final class cwt implements zvt {
    public final q650 a;
    public final o2k b;

    public cwt(q650 q650Var, btt bttVar, o2k o2kVar) {
        this.a = q650Var;
        this.b = o2kVar;
    }

    @Override // defpackage.zvt
    public final yzh a() {
        return bm50.a(new or60(new awt(this, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.zvt
    public final Object b(x1b x1bVar) {
        bwt bwtVar;
        UiText uiText;
        Object bVar;
        UiText text;
        if (x1bVar instanceof bwt) {
            bwtVar = (bwt) x1bVar;
            int i = bwtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                bwtVar.d = i - Integer.MIN_VALUE;
            } else {
                bwtVar = new bwt(this, x1bVar);
            }
        } else {
            bwtVar = new bwt(this, x1bVar);
        }
        Object obj = bwtVar.b;
        y5b y5bVar = y5b.a;
        int i2 = bwtVar.d;
        if (i2 == 0) {
            uj50.b(obj);
            ResourceUiText resourceUiText = vch0.b;
            try {
                zi50.a aVar = zi50.b;
                q650 q650Var = this.a;
                bwtVar.a = resourceUiText;
                bwtVar.d = 1;
                Object objF = q650Var.a.f(null, bwtVar);
                if (objF == y5bVar) {
                    return y5bVar;
                }
                uiText = resourceUiText;
                obj = objF;
            } catch (Throwable th) {
                th = th;
                uiText = resourceUiText;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uiText = bwtVar.a;
            try {
                uj50.b(obj);
            } catch (Throwable th2) {
                th = th2;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = this.b.a((xxt) n52.b((BaseResponse) obj));
        zi50.a aVar4 = zi50.b;
        Object obj2 = bVar instanceof zi50.b ? null : bVar;
        if (obj2 != null) {
            return new lk50.c(obj2);
        }
        Throwable thA = zi50.a(bVar);
        if (thA == null) {
            thA = new Throwable("Unknown error");
        }
        Throwable thA2 = zi50.a(bVar);
        if (thA2 != null) {
            fk50 fk50Var = (fk50) (thA2 instanceof fk50 ? thA2 : null);
            if (fk50Var != null && (text = fk50Var.getText()) != null) {
                uiText = text;
            }
        }
        return new lk50.a(thA, uiText);
    }
}
