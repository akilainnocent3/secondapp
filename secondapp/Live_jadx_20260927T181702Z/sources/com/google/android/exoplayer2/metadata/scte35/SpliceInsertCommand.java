package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import eh.f1;
import eh.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f48552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f48553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f48554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f48555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f48556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f48557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<b> f48558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f48559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f48560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f48561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f48562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f48563n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f48566c;

        public /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f48564a);
            parcel.writeLong(this.f48565b);
            parcel.writeLong(this.f48566c);
        }

        public b(int i10, long j10, long j11) {
            this.f48564a = i10;
            this.f48565b = j10;
            this.f48566c = j11;
        }
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand a(t0 t0Var, long j10, f1 f1Var) {
        List list;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iL;
        int iL2;
        boolean z14;
        long jN = t0Var.N();
        boolean z15 = (t0Var.L() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long jN2 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j11 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iL = 0;
            iL2 = 0;
        } else {
            int iL3 = t0Var.L();
            boolean z16 = (iL3 & 128) != 0;
            boolean z17 = (iL3 & 64) != 0;
            boolean z18 = (iL3 & 32) != 0;
            boolean z19 = (iL3 & 16) != 0;
            long jB = (!z17 || z19) ? -9223372036854775807L : TimeSignalCommand.b(t0Var, j10);
            if (!z17) {
                int iL4 = t0Var.L();
                ArrayList arrayList = new ArrayList(iL4);
                int i11 = 0;
                while (i11 < iL4) {
                    int iL5 = t0Var.L();
                    long jB2 = !z19 ? TimeSignalCommand.b(t0Var, j10) : -9223372036854775807L;
                    arrayList.add(new b(iL5, jB2, f1Var.b(jB2), null));
                    i11++;
                    iL4 = iL4;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jL = t0Var.L();
                boolean z20 = (128 & jL) != 0;
                jN2 = ((((jL & 1) << 32) | t0Var.N()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iR = t0Var.R();
            long j12 = jB;
            j11 = jN2;
            jN2 = j12;
            iL = t0Var.L();
            iL2 = t0Var.L();
            i10 = iR;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new SpliceInsertCommand(jN, z15, z10, z11, z12, jN2, f1Var.b(jN2), list, z13, j11, i10, iL, iL2);
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f48556g + ", programSplicePlaybackPositionUs= " + this.f48557h + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f48551b);
        parcel.writeByte(this.f48552c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48553d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48554e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f48555f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48556g);
        parcel.writeLong(this.f48557h);
        int size = this.f48558i.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f48558i.get(i11).b(parcel);
        }
        parcel.writeByte(this.f48559j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f48560k);
        parcel.writeInt(this.f48561l);
        parcel.writeInt(this.f48562m);
        parcel.writeInt(this.f48563n);
    }

    public SpliceInsertCommand(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f48551b = j10;
        this.f48552c = z10;
        this.f48553d = z11;
        this.f48554e = z12;
        this.f48555f = z13;
        this.f48556g = j11;
        this.f48557h = j12;
        this.f48558i = Collections.unmodifiableList(list);
        this.f48559j = z14;
        this.f48560k = j13;
        this.f48561l = i10;
        this.f48562m = i11;
        this.f48563n = i12;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f48551b = parcel.readLong();
        this.f48552c = parcel.readByte() == 1;
        this.f48553d = parcel.readByte() == 1;
        this.f48554e = parcel.readByte() == 1;
        this.f48555f = parcel.readByte() == 1;
        this.f48556g = parcel.readLong();
        this.f48557h = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f48558i = Collections.unmodifiableList(arrayList);
        this.f48559j = parcel.readByte() == 1;
        this.f48560k = parcel.readLong();
        this.f48561l = parcel.readInt();
        this.f48562m = parcel.readInt();
        this.f48563n = parcel.readInt();
    }
}
