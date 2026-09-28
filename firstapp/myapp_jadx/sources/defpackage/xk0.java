package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes4.dex */
public final class xk0 implements anf0<nk0> {
    public final Context a;
    public final nk0.b b;

    public xk0(Context context, String str) {
        context.getClass();
        this.a = context;
        nk0.b bVar = new nk0.b((Object) null);
        bVar.g(str);
        this.b = bVar;
    }

    @Override // defpackage.anf0
    public final anf0<nk0> b(String str) {
        this.b.g(str);
        return this;
    }

    @Override // defpackage.anf0
    public final anf0<nk0> c(Object obj, String str) {
        str.getClass();
        boolean z = obj instanceof UiText;
        nk0.b bVar = this.b;
        if (z) {
            bVar.e(((UiText) obj).a(this.a));
            return this;
        }
        if (obj instanceof nk0) {
            bVar.e((nk0) obj);
            return this;
        }
        if (obj != null) {
            bVar.g(anf0.a(obj, str));
            return this;
        }
        bVar.g("");
        return this;
    }

    @Override // defpackage.anf0
    public final String d() {
        return this.b.m().b;
    }

    @Override // defpackage.anf0
    public final nk0 e() {
        return this.b.m();
    }
}
