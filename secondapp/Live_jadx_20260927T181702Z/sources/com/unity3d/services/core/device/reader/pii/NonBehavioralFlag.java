package com.unity3d.services.core.device.reader.pii;

import dr.i1;
import dr.j1;
import java.util.Locale;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;


    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nNonBehavioralFlag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonBehavioralFlag.kt\ncom/unity3d/services/core/device/reader/pii/NonBehavioralFlag$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,12:1\n1#2:13\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final NonBehavioralFlag fromString(@l String value) {
            Object objB;
            m0.p(value, "value");
            try {
                i1.a aVar = i1.f79460c;
                String upperCase = value.toUpperCase(Locale.ROOT);
                m0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objB = i1.b(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th2) {
                i1.a aVar2 = i1.f79460c;
                objB = i1.b(j1.a(th2));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (i1.i(objB)) {
                objB = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) objB;
        }

        private Companion() {
        }
    }
}
