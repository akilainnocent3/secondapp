package com.yandex.div.core.dagger;

import com.yandex.div.core.experiments.Experiment;
import er.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@cr.d
@e(er.a.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExperimentFlag {
    Experiment experiment();
}
