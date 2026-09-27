package vb;

import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e<DataType> implements xb.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tb.d<DataType> f140658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DataType f140659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.i f140660c;

    public e(tb.d<DataType> dVar, DataType datatype, tb.i iVar) {
        this.f140658a = dVar;
        this.f140659b = datatype;
        this.f140660c = iVar;
    }

    @Override // xb.a.b
    public boolean a(@NonNull File file) {
        return this.f140658a.b(this.f140659b, file, this.f140660c);
    }
}
