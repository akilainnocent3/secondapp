package com.inmobi.ads;

import cs.o;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum AudioStatus {
    PLAYING,
    PAUSED,
    COMPLETED;

    private static final /* synthetic */ sr.a $ENTRIES = sr.c.c(values());

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        private Companion() {
        }

        @l
        @o
        public AudioStatus from(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED;
            }
            return AudioStatus.PLAYING;
        }

        @l
        @o
        public Integer to(@l AudioStatus item) {
            m0.p(item, "item");
            return Integer.valueOf(item.ordinal());
        }
    }

    @l
    @o
    public static AudioStatus from(int i10) {
        return Companion.from(i10);
    }

    @l
    public static sr.a<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    @o
    public static int to(@l AudioStatus audioStatus) {
        return Companion.to(audioStatus).intValue();
    }
}
