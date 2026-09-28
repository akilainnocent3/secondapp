package androidx.media3.ui;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    public interface a {
        void n(long j);

        void r(long j);

        void v(long j, boolean z);
    }

    void a(a aVar);

    long getPreferredUpdateDelay();

    void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setPosition(long j);
}
