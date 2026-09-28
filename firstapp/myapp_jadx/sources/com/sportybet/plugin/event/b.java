package com.sportybet.plugin.event;

import com.sportybet.android.data.CallbackWrapper;
import com.sportybet.plugin.event.view.LiveEventVideoView;
import com.sportybet.plugin.realsports.data.LiveStreamDataWebView;
import com.sportybet.plugin.realsports.streaming.provider.perform.api.data.PerformStreamResp;
import com.sportybet.plugin.realsports.streaming.provider.perform.api.data.StreamLauncher;
import com.sportybet.plugin.realsports.streaming.provider.perform.api.data.StreamLauncherData;
import defpackage.agd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends CallbackWrapper<PerformStreamResp> {
    public final /* synthetic */ EventActivity a;
    public final /* synthetic */ LiveStreamDataWebView b;

    public b(EventActivity eventActivity, LiveStreamDataWebView liveStreamDataWebView) {
        this.a = eventActivity;
        this.b = liveStreamDataWebView;
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseFailure(Throwable th) {
        EventActivity.b bVar = EventActivity.b.b;
        EventActivity eventActivity = this.a;
        eventActivity.q0 = bVar;
        agd0 agd0Var = eventActivity.R;
        if (agd0Var != null) {
            agd0Var.w.E(this.b, th);
        } else {
            Intrinsics.n("binding");
            throw null;
        }
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseSuccess(PerformStreamResp performStreamResp) {
        String str;
        Object obj;
        PerformStreamResp performStreamResp2 = performStreamResp;
        performStreamResp2.getClass();
        StreamLauncher streamLauncher = performStreamResp2.launchInfo;
        List<StreamLauncherData> list = streamLauncher != null ? streamLauncher.streamLauncher : null;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((StreamLauncherData) it.next()).launcherURL;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            int size = arrayList.size();
            int i = 0;
            do {
                if (i >= size) {
                    obj = null;
                    break;
                } else {
                    obj = arrayList.get(i);
                    i++;
                }
            } while (((String) obj).length() <= 0);
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            onResponseFailure(null);
            return;
        }
        EventActivity eventActivity = this.a;
        agd0 agd0Var = eventActivity.R;
        if (agd0Var == null) {
            Intrinsics.n("binding");
            throw null;
        }
        LiveEventVideoView liveEventVideoView = agd0Var.w;
        Boolean boolD = eventActivity.H0.d();
        liveEventVideoView.G(str, this.b, boolD != null ? boolD.booleanValue() : false);
    }
}
