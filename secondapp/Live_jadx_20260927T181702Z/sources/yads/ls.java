package yads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f152100a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f152101b = new SparseArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f152102c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f152103d = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ks f152104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ks f152105f;

    public ls(jn0 jn0Var, File file) {
        is isVar = new is(jn0Var);
        js jsVar = new js(new File(file, "monetization_cached_content_index.exi"));
        this.f152104e = isVar;
        this.f152105f = jsVar;
    }

    public final hs a(String str) {
        hs hsVar = (hs) this.f152100a.get(str);
        if (hsVar != null) {
            return hsVar;
        }
        SparseArray sparseArray = this.f152101b;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        hs hsVar2 = new hs(iKeyAt, str, jc0.f151012c);
        this.f152100a.put(str, hsVar2);
        this.f152101b.put(iKeyAt, str);
        this.f152103d.put(iKeyAt, true);
        this.f152104e.a(hsVar2);
        return hsVar2;
    }

    public final void b(String str) {
        hs hsVar = (hs) this.f152100a.get(str);
        if (hsVar != null && hsVar.f150262c.isEmpty() && hsVar.f150263d.isEmpty()) {
            this.f152100a.remove(str);
            int i10 = hsVar.f150260a;
            boolean z10 = this.f152103d.get(i10);
            this.f152104e.a(hsVar, z10);
            if (z10) {
                this.f152101b.remove(i10);
                this.f152103d.delete(i10);
            } else {
                this.f152101b.put(i10, null);
                this.f152102c.put(i10, true);
            }
        }
    }

    public final void a(long j10) {
        ks ksVar;
        this.f152104e.a(j10);
        ks ksVar2 = this.f152105f;
        if (ksVar2 != null) {
            ksVar2.a(j10);
        }
        if (!this.f152104e.a() && (ksVar = this.f152105f) != null && ksVar.a()) {
            this.f152105f.a(this.f152100a, this.f152101b);
            this.f152104e.b(this.f152100a);
        } else {
            this.f152104e.a(this.f152100a, this.f152101b);
        }
        ks ksVar3 = this.f152105f;
        if (ksVar3 != null) {
            ksVar3.b();
            this.f152105f = null;
        }
    }

    public static jc0 a(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 >= 0) {
                int iMin = Math.min(i12, 10485760);
                byte[] bArrCopyOf = ib3.f150521f;
                int i13 = 0;
                while (i13 != i12) {
                    int i14 = i13 + iMin;
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                    dataInputStream.readFully(bArrCopyOf, i13, iMin);
                    iMin = Math.min(i12 - i14, 10485760);
                    i13 = i14;
                }
                map.put(utf, bArrCopyOf);
            } else {
                throw new IOException(mg2.a("Invalid value size: ", i12));
            }
        }
        return new jc0(map);
    }

    public final void a() {
        this.f152104e.a(this.f152100a);
        int size = this.f152102c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f152101b.remove(this.f152102c.keyAt(i10));
        }
        this.f152102c.clear();
        this.f152103d.clear();
    }
}
