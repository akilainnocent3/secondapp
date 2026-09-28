package okhttp3.internal.connection;

import defpackage.bc5;
import defpackage.cc5;
import defpackage.fja0;
import defpackage.uw90;
import defpackage.zpa0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lokhttp3/internal/connection/BufferedSocket;", "Lfja0;", "Lcc5;", "getSource", "()Lcc5;", "source", "Lbc5;", "getSink", "()Lbc5;", "sink", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BufferedSocket extends fja0 {
    @Override // defpackage.fja0
    /* synthetic */ void cancel();

    @Override // defpackage.fja0
    bc5 getSink();

    @Override // defpackage.fja0
    /* synthetic */ uw90 getSink();

    @Override // defpackage.fja0
    cc5 getSource();

    @Override // defpackage.fja0
    /* synthetic */ zpa0 getSource();
}
