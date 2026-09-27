package com.applovin.shadow.okio;

import java.util.Arrays;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nSegment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Segment.kt\nokio/Segment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n1#2:188\n*E\n"})
public final class Segment {

    @oy.l
    public static final Companion Companion = new Companion(null);
    public static final int SHARE_MINIMUM = 1024;
    public static final int SIZE = 8192;

    @oy.l
    @cs.g
    public final byte[] data;

    @cs.g
    public int limit;

    @cs.g
    @oy.m
    public Segment next;

    @cs.g
    public boolean owner;

    @cs.g
    public int pos;

    @cs.g
    @oy.m
    public Segment prev;

    @cs.g
    public boolean shared;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.x xVar) {
            this();
        }

        private Companion() {
        }
    }

    public Segment() {
        this.data = new byte[8192];
        this.owner = true;
        this.shared = false;
    }

    public final void compact() {
        int i10;
        Segment segment = this.prev;
        if (segment == this) {
            throw new IllegalStateException("cannot compact");
        }
        m0.m(segment);
        if (segment.owner) {
            int i11 = this.limit - this.pos;
            Segment segment2 = this.prev;
            m0.m(segment2);
            int i12 = 8192 - segment2.limit;
            Segment segment3 = this.prev;
            m0.m(segment3);
            if (segment3.shared) {
                i10 = 0;
            } else {
                Segment segment4 = this.prev;
                m0.m(segment4);
                i10 = segment4.pos;
            }
            if (i11 > i12 + i10) {
                return;
            }
            Segment segment5 = this.prev;
            m0.m(segment5);
            writeTo(segment5, i11);
            pop();
            SegmentPool.recycle(this);
        }
    }

    @oy.m
    public final Segment pop() {
        Segment segment = this.next;
        if (segment == this) {
            segment = null;
        }
        Segment segment2 = this.prev;
        m0.m(segment2);
        segment2.next = this.next;
        Segment segment3 = this.next;
        m0.m(segment3);
        segment3.prev = this.prev;
        this.next = null;
        this.prev = null;
        return segment;
    }

    @oy.l
    public final Segment push(@oy.l Segment segment) {
        m0.p(segment, "segment");
        segment.prev = this;
        segment.next = this.next;
        Segment segment2 = this.next;
        m0.m(segment2);
        segment2.prev = segment;
        this.next = segment;
        return segment;
    }

    @oy.l
    public final Segment sharedCopy() {
        this.shared = true;
        return new Segment(this.data, this.pos, this.limit, true, false);
    }

    @oy.l
    public final Segment split(int i10) {
        Segment segmentTake;
        if (i10 <= 0 || i10 > this.limit - this.pos) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            segmentTake = sharedCopy();
        } else {
            segmentTake = SegmentPool.take();
            byte[] bArr = this.data;
            byte[] bArr2 = segmentTake.data;
            int i11 = this.pos;
            fr.q.E0(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        segmentTake.limit = segmentTake.pos + i10;
        this.pos += i10;
        Segment segment = this.prev;
        m0.m(segment);
        segment.push(segmentTake);
        return segmentTake;
    }

    @oy.l
    public final Segment unsharedCopy() {
        byte[] bArr = this.data;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        m0.o(bArrCopyOf, "copyOf(this, size)");
        return new Segment(bArrCopyOf, this.pos, this.limit, false, true);
    }

    public final void writeTo(@oy.l Segment sink, int i10) {
        m0.p(sink, "sink");
        if (!sink.owner) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.limit;
        if (i11 + i10 > 8192) {
            if (sink.shared) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.pos;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.data;
            fr.q.E0(bArr, bArr, 0, i12, i11, 2, null);
            sink.limit -= sink.pos;
            sink.pos = 0;
        }
        byte[] bArr2 = this.data;
        byte[] bArr3 = sink.data;
        int i13 = sink.limit;
        int i14 = this.pos;
        fr.q.v0(bArr2, bArr3, i13, i14, i14 + i10);
        sink.limit += i10;
        this.pos += i10;
    }

    public Segment(@oy.l byte[] data, int i10, int i11, boolean z10, boolean z11) {
        m0.p(data, "data");
        this.data = data;
        this.pos = i10;
        this.limit = i11;
        this.shared = z10;
        this.owner = z11;
    }
}
