package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.data.paging.mediator.MatchAlertPagingMediator", f = "MatchAlertPagingMediator.kt", l = {38, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 52}, m = "fetchRemote", v = 2)
public final class juu extends x1b {
    public xqz a;
    public luu b;
    public String c;
    public String d;
    public List e;
    public boolean f;
    public int i;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ luu y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juu(luu luuVar, x1b x1bVar) {
        super(x1bVar);
        this.y = luuVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.c(null, false, this);
    }
}
