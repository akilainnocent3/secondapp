package o0;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class f extends b implements Iterable<d> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements Iterator<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f f118585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f118586c = 0;

        public a(f fVar) {
            this.f118585b = fVar;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d next() {
            d dVar = (d) this.f118585b.f118575i.get(this.f118586c);
            this.f118586c++;
            return dVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f118586c < this.f118585b.size();
        }
    }

    public f(char[] cArr) {
        super(cArr);
    }

    public static f f0(char[] cArr) {
        return new f(cArr);
    }

    @Override // o0.b, o0.c
    @NonNull
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f e() {
        return (f) super.e();
    }

    public String i0() {
        return y(0, 0);
    }

    @Override // java.lang.Iterable
    public Iterator<d> iterator() {
        return new a(this);
    }

    @Override // o0.c
    public String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(i());
        sb2.append("{\n");
        boolean z10 = true;
        for (c cVar : this.f118575i) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cVar.y(c.f118577h + i10, i11 - 1));
        }
        sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
        a(sb2, i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // o0.c
    public String z() {
        StringBuilder sb2 = new StringBuilder(i() + "{ ");
        boolean z10 = true;
        for (c cVar : this.f118575i) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cVar.z());
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
