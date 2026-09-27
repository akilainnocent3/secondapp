package ij;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@yi.c
@r
@yi.d
public class a extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Appendable f94268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f94269c;

    public a(Appendable target) {
        this.f94268b = (Appendable) zi.l0.E(target);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f94269c = true;
        Appendable appendable = this.f94268b;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public final void d() throws IOException {
        if (this.f94269c) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        d();
        Appendable appendable = this.f94268b;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cbuf, int off, int len) throws IOException {
        d();
        this.f94268b.append(new String(cbuf, off, len));
    }

    @Override // java.io.Writer
    public void write(int c10) throws IOException {
        d();
        this.f94268b.append((char) c10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        d();
        this.f94268b.append(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        zi.l0.E(str);
        d();
        this.f94268b.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@zq.a CharSequence charSeq) throws IOException {
        d();
        this.f94268b.append(charSeq);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@zq.a CharSequence charSeq, int start, int end) throws IOException {
        d();
        this.f94268b.append(charSeq, start, end);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int off, int len) throws IOException {
        zi.l0.E(str);
        d();
        this.f94268b.append(str, off, len + off);
    }
}
