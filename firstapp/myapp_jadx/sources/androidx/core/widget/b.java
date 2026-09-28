package androidx.core.widget;

import android.os.Parcel;
import defpackage.qlr;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends qlr implements Function1<Parcel, RemoteViewsCompatService.a> {
    public static final b a = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final RemoteViewsCompatService.a invoke(Parcel parcel) {
        Parcel parcel2 = parcel;
        parcel2.getClass();
        return new RemoteViewsCompatService.a(parcel2);
    }
}
