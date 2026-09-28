package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tnz extends snz.a<Object, Object> {
    public final /* synthetic */ bc6 a;
    public final /* synthetic */ boolean b;

    public tnz(bc6 bc6Var, boolean z) {
        this.a = bc6Var;
        this.b = z;
    }

    public final void a(List list, Integer num) {
        list.getClass();
        zi50.a aVar = zi50.b;
        boolean z = this.b;
        this.a.resumeWith(new aqc.c(list, z ? null : num, z ? num : null, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
