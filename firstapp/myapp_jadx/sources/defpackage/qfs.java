package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes8.dex */
public final class qfs implements Sequence<String> {
    public final BufferedReader a;

    public static final class a implements Iterator<String>, dhp {
        public String a;
        public boolean b;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() throws IOException {
            String line = this.a;
            if (line == null && !this.b) {
                line = qfs.this.a.readLine();
                this.a = line;
                if (line == null) {
                    this.b = true;
                }
            }
            return line != null;
        }

        @Override // java.util.Iterator
        public final String next() {
            if (!hasNext()) {
                lrh0.a();
                return null;
            }
            String str = this.a;
            this.a = null;
            str.getClass();
            return str;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public qfs(BufferedReader bufferedReader) {
        this.a = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator<String> iterator() {
        return new a();
    }
}
