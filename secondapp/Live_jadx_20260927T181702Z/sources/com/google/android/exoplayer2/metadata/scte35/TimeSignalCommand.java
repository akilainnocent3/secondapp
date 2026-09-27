package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import eh.f1;
import eh.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48582c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeSignalCommand[] newArray(int i10) {
            return new TimeSignalCommand[i10];
        }
    }

    public /* synthetic */ TimeSignalCommand(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    public static TimeSignalCommand a(t0 t0Var, long j10, f1 f1Var) {
        long jB = b(t0Var, j10);
        return new TimeSignalCommand(jB, f1Var.b(jB));
    }

    public static long b(t0 t0Var, long j10) {
        long jL = t0Var.L();
        if ((128 & jL) != 0) {
            return 8589934591L & ((((jL & 1) << 32) | t0Var.N()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.metadata.scte35.SpliceCommand
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f48581b + ", playbackPositionUs= " + this.f48582c + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f48581b);
        parcel.writeLong(this.f48582c);
    }

    public TimeSignalCommand(long j10, long j11) {
        this.f48581b = j10;
        this.f48582c = j11;
    }
}
