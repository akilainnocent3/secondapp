package hc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements qb.a.InterfaceC1180a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.e f88121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final wb.b f88122b;

    public b(wb.e eVar) {
        this(eVar, null);
    }

    @Override // qb.a.InterfaceC1180a
    @NonNull
    public byte[] a(int i10) {
        wb.b bVar = this.f88122b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // qb.a.InterfaceC1180a
    @NonNull
    public Bitmap b(int i10, int i11, @NonNull Bitmap.Config config) {
        return this.f88121a.f(i10, i11, config);
    }

    @Override // qb.a.InterfaceC1180a
    public void c(@NonNull Bitmap bitmap) {
        this.f88121a.d(bitmap);
    }

    @Override // qb.a.InterfaceC1180a
    @NonNull
    public int[] d(int i10) {
        wb.b bVar = this.f88122b;
        return bVar == null ? new int[i10] : (int[]) bVar.c(i10, int[].class);
    }

    @Override // qb.a.InterfaceC1180a
    public void e(@NonNull byte[] bArr) {
        wb.b bVar = this.f88122b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // qb.a.InterfaceC1180a
    public void f(@NonNull int[] iArr) {
        wb.b bVar = this.f88122b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }

    public b(wb.e eVar, @Nullable wb.b bVar) {
        this.f88121a = eVar;
        this.f88122b = bVar;
    }
}
