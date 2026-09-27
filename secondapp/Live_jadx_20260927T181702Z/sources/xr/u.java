package xr;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class u implements zu.m<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final BufferedReader f145546a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements Iterator<String>, es.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f145547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f145548c;

        public a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f145547b;
            this.f145547b = null;
            m0.m(str);
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f145547b == null && !this.f145548c) {
                String line = u.this.f145546a.readLine();
                this.f145547b = line;
                if (line == null) {
                    this.f145548c = true;
                }
            }
            return this.f145547b != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public u(@oy.l BufferedReader reader) {
        m0.p(reader, "reader");
        this.f145546a = reader;
    }

    @Override // zu.m
    @oy.l
    public Iterator<String> iterator() {
        return new a();
    }
}
