package defpackage;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xxf0 extends d630 {
    public static final xxf0 b = new xxf0(0, Timestamp.class, "seconds", "getSeconds()J");

    @Override // defpackage.d630, defpackage.mhp
    public final Object get(Object obj) {
        return Long.valueOf(((Timestamp) obj).a);
    }
}
