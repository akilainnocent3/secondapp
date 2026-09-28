package defpackage;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yxf0 extends d630 {
    public static final yxf0 b = new yxf0(0, Timestamp.class, "nanoseconds", "getNanoseconds()I");

    @Override // defpackage.d630, defpackage.mhp
    public final Object get(Object obj) {
        return Integer.valueOf(((Timestamp) obj).b);
    }
}
