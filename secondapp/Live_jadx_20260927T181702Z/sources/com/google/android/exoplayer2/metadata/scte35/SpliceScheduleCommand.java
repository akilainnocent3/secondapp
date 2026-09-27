package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import eh.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<c> f48567b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48569b;

        public /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.f48568a);
            parcel.writeLong(this.f48569b);
        }

        public b(int i10, long j10) {
            this.f48568a = i10;
            this.f48569b = j10;
        }
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceScheduleCommand a(t0 t0Var) {
        int iL = t0Var.L();
        ArrayList arrayList = new ArrayList(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            arrayList.add(c.e(t0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f48567b.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f48567b.get(i11).f(parcel);
        }
    }

    public SpliceScheduleCommand(List<c> list) {
        this.f48567b = Collections.unmodifiableList(list);
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f48567b = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f48570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f48572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f48573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f48574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List<b> f48575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f48576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f48577h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f48578i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f48579j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f48580k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f48570a = j10;
            this.f48571b = z10;
            this.f48572c = z11;
            this.f48573d = z12;
            this.f48575f = Collections.unmodifiableList(list);
            this.f48574e = j11;
            this.f48576g = z13;
            this.f48577h = j12;
            this.f48578i = i10;
            this.f48579j = i11;
            this.f48580k = i12;
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(t0 t0Var) {
            ArrayList arrayList;
            boolean z10;
            boolean z11;
            long j10;
            boolean z12;
            long j11;
            int i10;
            int i11;
            int iL;
            boolean z13;
            long jN;
            long jN2 = t0Var.N();
            boolean z14 = true;
            if ((t0Var.L() & 128) == 0) {
                z14 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                z11 = false;
                j10 = -9223372036854775807L;
                z12 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iL = 0;
            } else {
                int iL2 = t0Var.L();
                boolean z15 = (iL2 & 128) != 0;
                boolean z16 = (iL2 & 64) != 0 ? z14 : false;
                boolean z17 = (iL2 & 32) != 0 ? z14 : false;
                long jN3 = z16 ? t0Var.N() : -9223372036854775807L;
                if (!z16) {
                    int iL3 = t0Var.L();
                    ArrayList arrayList3 = new ArrayList(iL3);
                    int i12 = 0;
                    while (i12 < iL3) {
                        arrayList3.add(new b(t0Var.L(), t0Var.N(), null));
                        i12++;
                        iL3 = iL3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jL = t0Var.L();
                    boolean z18 = (128 & jL) != 0;
                    jN = ((((jL & 1) << 32) | t0Var.N()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    jN = -9223372036854775807L;
                }
                int iR = t0Var.R();
                int iL4 = t0Var.L();
                boolean z19 = z15;
                z12 = z13;
                z10 = z19;
                iL = t0Var.L();
                long j12 = jN3;
                i10 = iR;
                i11 = iL4;
                long j13 = jN;
                arrayList = arrayList2;
                z11 = z16;
                j10 = j12;
                j11 = j13;
            }
            return new c(jN2, z14, z10, z11, arrayList, j10, z12, j11, i10, i11, iL);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.f48570a);
            parcel.writeByte(this.f48571b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f48572c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f48573d ? (byte) 1 : (byte) 0);
            int size = this.f48575f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f48575f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f48574e);
            parcel.writeByte(this.f48576g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f48577h);
            parcel.writeInt(this.f48578i);
            parcel.writeInt(this.f48579j);
            parcel.writeInt(this.f48580k);
        }

        public c(Parcel parcel) {
            this.f48570a = parcel.readLong();
            this.f48571b = parcel.readByte() == 1;
            this.f48572c = parcel.readByte() == 1;
            this.f48573d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f48575f = Collections.unmodifiableList(arrayList);
            this.f48574e = parcel.readLong();
            this.f48576g = parcel.readByte() == 1;
            this.f48577h = parcel.readLong();
            this.f48578i = parcel.readInt();
            this.f48579j = parcel.readInt();
            this.f48580k = parcel.readInt();
        }
    }
}
