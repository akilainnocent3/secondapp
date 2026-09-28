package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ppt implements gaj {
    public final /* synthetic */ float a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ crz c;
    public final /* synthetic */ String d;
    public final /* synthetic */ imf0 e;

    public /* synthetic */ ppt(float f, boolean z, crz crzVar, String str, imf0 imf0Var) {
        this.a = f;
        this.b = z;
        this.c = crzVar;
        this.d = str;
        this.e = imf0Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((m75) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            h9n.a(this.c, "bg", dw.a(j.e(h.j(d.a.b, this.a, 0.0f, 0.0f, 0.0f, 14), 1.0f), this.b ? 0.75f : 1.0f), null, d0b.a.g, 0.0f, null, aVar, 24624, 104);
            lkf0.d(this.d, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, this.e, aVar, 0, 0, 131070);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
