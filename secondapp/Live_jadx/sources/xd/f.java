package xd;

import dr.r2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class f implements Closeable, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f144854b = 1179403647;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileChannel f144855c;

    public f(final File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f144855c = new FileInputStream(file).getChannel();
    }

    public final long a(final c.b header, final long numEntries, final long vma) throws IOException {
        for (long j10 = 0; j10 < numEntries; j10++) {
            c.AbstractC1525c abstractC1525cB = header.b(j10);
            if (abstractC1525cB.f144847a == 1) {
                long j11 = abstractC1525cB.f144849c;
                if (j11 <= vma && vma <= abstractC1525cB.f144850d + j11) {
                    return (vma - j11) + abstractC1525cB.f144848b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f144855c.close();
    }

    public c.b d() throws IOException {
        this.f144855c.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (o(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sK = k(byteBufferAllocate, 4L);
        boolean z10 = k(byteBufferAllocate, 5L) == 2;
        if (sK == 1) {
            return new d(z10, this);
        }
        if (sK == 2) {
            return new e(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List<String> h() throws IOException {
        long j10;
        long j11;
        this.f144855c.position(0L);
        ArrayList arrayList = new ArrayList();
        c.b bVarD = d();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(bVarD.f144836a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = bVarD.f144841f;
        int i10 = 0;
        if (j12 == 65535) {
            j12 = bVarD.c(0).f144851a;
        }
        long j13 = 0;
        while (true) {
            j10 = 1;
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            c.AbstractC1525c abstractC1525cB = bVarD.b(j13);
            if (abstractC1525cB.f144847a == 2) {
                j11 = abstractC1525cB.f144848b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c.a aVarA = bVarD.a(j11, i10);
            long j15 = j10;
            long j16 = aVarA.f144831a;
            if (j16 == j15) {
                arrayList2.add(Long.valueOf(aVarA.f144832b));
            } else if (j16 == 5) {
                j14 = aVarA.f144832b;
            }
            i10++;
            if (aVarA.f144831a == 0) {
                break;
            }
            j10 = j15;
            j12 = j12;
        }
        if (j14 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(bVarD, j12, j14);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(n(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    public void i(final ByteBuffer buffer, long offset, final int length) throws IOException {
        buffer.position(0);
        buffer.limit(length);
        long j10 = 0;
        while (j10 < length) {
            int i10 = this.f144855c.read(buffer, offset + j10);
            if (i10 == -1) {
                throw new EOFException();
            }
            j10 += (long) i10;
        }
        buffer.position(0);
    }

    public short k(final ByteBuffer buffer, final long offset) throws IOException {
        i(buffer, offset, 1);
        return (short) (buffer.get() & 255);
    }

    public int l(final ByteBuffer buffer, final long offset) throws IOException {
        i(buffer, offset, 2);
        return buffer.getShort() & r2.f79504e;
    }

    public long m(final ByteBuffer buffer, final long offset) throws IOException {
        i(buffer, offset, 8);
        return buffer.getLong();
    }

    public String n(final ByteBuffer buffer, long offset) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j10 = 1 + offset;
            short sK = k(buffer, offset);
            if (sK == 0) {
                return sb2.toString();
            }
            sb2.append((char) sK);
            offset = j10;
        }
    }

    public long o(final ByteBuffer buffer, final long offset) throws IOException {
        i(buffer, offset, 4);
        return ((long) buffer.getInt()) & 4294967295L;
    }
}
