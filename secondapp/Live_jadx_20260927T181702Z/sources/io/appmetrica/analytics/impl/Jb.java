package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Jb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Kb.a(configuration) : fr.g0.l(He.a(configuration.locale));
    }
}
