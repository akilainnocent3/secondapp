package com.yandex.div.core.timer;

import android.os.SystemClock;
import com.yandex.div.core.view2.errors.ErrorCollector;
import dr.i0;
import dr.k0;
import dr.m0;
import dr.w2;
import ds.a;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class Ticker {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long DEFAULT_VALUE = -1;

    @m
    private Long currentDuration;

    @m
    private Long currentInterval;

    @m
    private Long duration;

    @m
    private final ErrorCollector errorCollector;

    @m
    private Long interval;

    @l
    private final String name;

    @l
    private final ds.l<Long, w2> onEnd;

    @l
    private final ds.l<Long, w2> onInterrupt;

    @l
    private final ds.l<Long, w2> onStart;

    @l
    private final ds.l<Long, w2> onTick;
    private long workTimeFromPrevious;

    @l
    private State state = State.STOPPED;
    private long startedAt = -1;
    private long interruptedAt = -1;

    @l
    private final i0 timer$delegate = k0.a(m0.NONE, Ticker$timer$2.INSTANCE);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.timer.Ticker$runCountDownTimer$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements a<w2> {
        final /* synthetic */ long $duration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10) {
            super(0);
            this.$duration = j10;
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Ticker.this.cleanTicker();
            Ticker.this.onEnd.invoke(Long.valueOf(this.$duration));
            Ticker.this.state = State.STOPPED;
            Ticker.this.resetTickerState();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.timer.Ticker$runEndlessTimer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C47841 extends o0 implements a<w2> {
        public C47841() {
            super(0);
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Ticker.this.coercedTick();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.timer.Ticker$runTickTimer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C47851 extends o0 implements a<w2> {
        final /* synthetic */ long $duration;
        final /* synthetic */ long $interval;
        final /* synthetic */ a<w2> $processTick;
        final /* synthetic */ l1.g $ticksLeft;
        final /* synthetic */ Ticker this$0;

        /* JADX INFO: renamed from: com.yandex.div.core.timer.Ticker$runTickTimer$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C07471 extends o0 implements a<w2> {
            final /* synthetic */ a<w2> $processTick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07471(a<w2> aVar) {
                super(0);
                this.$processTick = aVar;
            }

            @Override // ds.a
            public /* bridge */ /* synthetic */ w2 invoke() {
                invoke2();
                return w2.f79517a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.$processTick.invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47851(long j10, Ticker ticker, l1.g gVar, long j11, a<w2> aVar) {
            super(0);
            this.$duration = j10;
            this.this$0 = ticker;
            this.$ticksLeft = gVar;
            this.$interval = j11;
            this.$processTick = aVar;
        }

        @Override // ds.a
        public /* bridge */ /* synthetic */ w2 invoke() {
            invoke2();
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            long totalWorkTime = this.$duration - this.this$0.getTotalWorkTime();
            this.this$0.coercedTick();
            this.$ticksLeft.f102748b--;
            if (1 <= totalWorkTime && totalWorkTime < this.$interval) {
                this.this$0.cleanTicker();
                Ticker.setupTimer$default(this.this$0, totalWorkTime, 0L, new C07471(this.$processTick), 2, null);
            } else if (totalWorkTime <= 0) {
                this.$processTick.invoke();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(@l String str, @l ds.l<? super Long, w2> lVar, @l ds.l<? super Long, w2> lVar2, @l ds.l<? super Long, w2> lVar3, @l ds.l<? super Long, w2> lVar4, @m ErrorCollector errorCollector) {
        this.name = str;
        this.onInterrupt = lVar;
        this.onStart = lVar2;
        this.onEnd = lVar3;
        this.onTick = lVar4;
        this.errorCollector = errorCollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanTicker() {
        getTimer().cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void coercedTick() {
        Long l10 = this.duration;
        if (l10 != null) {
            this.onTick.invoke(Long.valueOf(u.C(getTotalWorkTime(), l10.longValue())));
        } else {
            this.onTick.invoke(Long.valueOf(getTotalWorkTime()));
        }
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    private final FixedRateScheduler getTimer() {
        return (FixedRateScheduler) this.timer$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTotalWorkTime() {
        return getWorkTime() + this.workTimeFromPrevious;
    }

    private final long getWorkTime() {
        if (this.startedAt == -1) {
            return 0L;
        }
        return getCurrentTime() - this.startedAt;
    }

    private final void onError(String str) {
        ErrorCollector errorCollector = this.errorCollector;
        if (errorCollector != null) {
            errorCollector.logError(new IllegalArgumentException(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTickerState() {
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.workTimeFromPrevious = 0L;
    }

    private final void runCountDownTimer(long j10) {
        long totalWorkTime = j10 - getTotalWorkTime();
        if (totalWorkTime >= 0) {
            setupTimer$default(this, totalWorkTime, 0L, new AnonymousClass1(j10), 2, null);
        } else {
            this.onEnd.invoke(Long.valueOf(j10));
            resetTickerState();
        }
    }

    private final void runEndlessTimer(long j10) {
        setupTimer(j10, j10 - (getTotalWorkTime() % j10), new C47841());
    }

    private final void runTickTimer(long j10, long j11) {
        long totalWorkTime = j11 - (getTotalWorkTime() % j11);
        l1.g gVar = new l1.g();
        gVar.f102748b = (j10 / j11) - (getTotalWorkTime() / j11);
        setupTimer(j11, totalWorkTime, new C47851(j10, this, gVar, j11, new Ticker$runTickTimer$processTick$1(gVar, this, j10)));
    }

    private final void runTimer() {
        Long l10 = this.currentInterval;
        Long l11 = this.currentDuration;
        if (l10 != null && this.interruptedAt != -1 && getCurrentTime() - this.interruptedAt > l10.longValue()) {
            coercedTick();
        }
        if (l10 == null && l11 != null) {
            runCountDownTimer(l11.longValue());
            return;
        }
        if (l10 != null && l11 != null) {
            runTickTimer(l11.longValue(), l10.longValue());
        } else {
            if (l10 == null || l11 != null) {
                return;
            }
            runEndlessTimer(l10.longValue());
        }
    }

    private final void setupTimer(long j10, long j11, a<w2> aVar) {
        this.startedAt = getCurrentTime();
        getTimer().scheduleAtFixedRate(j11, j10, aVar);
    }

    public static /* synthetic */ void setupTimer$default(Ticker ticker, long j10, long j11, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = j10;
        }
        ticker.setupTimer(j10, j11, aVar);
    }

    public final void cancel() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 2 || i10 == 3) {
            this.state = State.STOPPED;
            cleanTicker();
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            resetTickerState();
        }
    }

    public final void pause() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i10 == 2) {
            this.state = State.PAUSED;
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            saveState();
            this.startedAt = -1L;
            return;
        }
        if (i10 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' already paused!");
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void restoreState(boolean z10) {
        if (!z10) {
            this.interruptedAt = -1L;
        }
        runTimer();
    }

    public final void resume() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' is stopped!");
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.state = State.WORKING;
            restoreState(false);
            return;
        }
        onError("The timer '" + this.name + "' already working!");
    }

    public final void saveState() {
        if (this.startedAt != -1) {
            this.workTimeFromPrevious += getCurrentTime() - this.startedAt;
            this.interruptedAt = getCurrentTime();
            this.startedAt = -1L;
        }
        cleanTicker();
    }

    public final void start() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            cleanTicker();
            this.currentDuration = this.duration;
            this.currentInterval = this.interval;
            this.state = State.WORKING;
            this.onStart.invoke(Long.valueOf(getTotalWorkTime()));
            runTimer();
            return;
        }
        if (i10 == 2) {
            onError("The timer '" + this.name + "' already working!");
            return;
        }
        if (i10 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' paused!");
    }

    public final void stop() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.state = State.STOPPED;
            this.onEnd.invoke(Long.valueOf(getTotalWorkTime()));
            cleanTicker();
            resetTickerState();
        }
    }

    public final void update(long j10, @m Long l10) {
        this.interval = l10;
        this.duration = j10 == 0 ? null : Long.valueOf(j10);
    }
}
