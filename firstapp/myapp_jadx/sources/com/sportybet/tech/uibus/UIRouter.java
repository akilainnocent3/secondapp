package com.sportybet.tech.uibus;

import android.net.Uri;
import android.os.Bundle;
import com.sportybet.android.router.Sender;
import com.twilio.voice.EventKeys;
import defpackage.zkh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&J4\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0010\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/sportybet/tech/uibus/UIRouter;", "", EventKeys.PRIORITY, "", "verifyUri", "", "uri", "Landroid/net/Uri;", "scheme", "", "host", "openUri", "bundle", "Landroid/os/Bundle;", "sender", "Lcom/sportybet/android/router/Sender;", "isGenericUri", "()Z", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface UIRouter {

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ boolean openUri$default(UIRouter uIRouter, Uri uri, String str, String str2, Bundle bundle, Sender sender, int i, Object obj) {
        if (obj != null) {
            zkh.a("Super calls with default arguments not supported in this target, function: openUri");
            return false;
        }
        if ((i & 16) != 0) {
            sender = Sender.UNKNOWN;
        }
        return uIRouter.openUri(uri, str, str2, bundle, sender);
    }

    boolean isGenericUri();

    boolean openUri(Uri uri, String scheme, String host, Bundle bundle, Sender sender);

    int priority();

    boolean verifyUri(Uri uri, String scheme, String host);
}
