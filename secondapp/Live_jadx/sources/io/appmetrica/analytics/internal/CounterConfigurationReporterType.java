package io.appmetrica.analytics.internal;

import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum CounterConfigurationReporterType {
    MAIN("main"),
    MANUAL("manual"),
    SELF_SDK("self_sdk"),
    COMMUTATION("commutation"),
    SELF_DIAGNOSTIC_MAIN("self_diagnostic_main"),
    SELF_DIAGNOSTIC_MANUAL("self_diagnostic_manual"),
    CRASH("crash");


    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f98738a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001b  */
        /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
        @l
        @o
        public final CounterConfigurationReporterType fromStringValue(@m String str) {
            for (CounterConfigurationReporterType counterConfigurationReporterType : CounterConfigurationReporterType.values()) {
                if (m0.g(counterConfigurationReporterType.getStringValue(), str)) {
                    if (counterConfigurationReporterType == null) {
                        return CounterConfigurationReporterType.MAIN;
                    }
                    return counterConfigurationReporterType;
                }
            }
            counterConfigurationReporterType = null;
            if (counterConfigurationReporterType == null) {
                return CounterConfigurationReporterType.MAIN;
            }
            return counterConfigurationReporterType;
        }

        private Companion() {
        }
    }

    CounterConfigurationReporterType(String str) {
        this.f98738a = str;
    }

    @l
    @o
    public static final CounterConfigurationReporterType fromStringValue(@m String str) {
        return Companion.fromStringValue(str);
    }

    @l
    public final String getStringValue() {
        return this.f98738a;
    }
}
