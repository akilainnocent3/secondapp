package com.yandex.div.core.expression.triggers;

import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.downloader.c;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.internal.Assert;
import com.yandex.div.json.expressions.Expression;
import dr.w2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.v1;
import mq.mp;
import mq.p0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class TriggerExecutor {

    @l
    private final List<p0> actions;

    @l
    private final Set<DivViewFacade> attachedViews;

    @l
    private Disposable bindCompletionDisposable;

    @l
    private final DivActionBinder divActionBinder;

    @l
    private final ErrorCollector errorCollector;

    @l
    private final Expression.MutableExpression<?, Boolean> expression;

    @l
    private final Div2Logger logger;

    @l
    private final Expression<mp.c> mode;

    @l
    private Disposable modeObserver;

    @l
    private Disposable observersDisposable;

    @l
    private Disposable removingDisposable;

    @l
    private final ExpressionResolverImpl resolver;

    @l
    private final ds.l<Boolean, w2> changeTrigger = new TriggerExecutor$changeTrigger$1(this);

    @l
    private mp.c currentMode = mp.c.ON_CONDITION;

    @l
    private WeakHashMap<DivViewFacade, Boolean> wasConditionSatisfied = new WeakHashMap<>();

    /* JADX INFO: renamed from: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass1 extends o0 implements ds.l<Variable, w2> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Variable variable) {
            invoke2(variable);
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l Variable variable) {
            TriggerExecutor.this.stopObserving();
        }
    }

    /* JADX INFO: renamed from: com.yandex.div.core.expression.triggers.TriggerExecutor$startObserving$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class AnonymousClass2 extends o0 implements ds.l<mp.c, w2> {
        public AnonymousClass2() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(mp.c cVar) {
            invoke2(cVar);
            return w2.f79517a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@l mp.c cVar) {
            TriggerExecutor.this.currentMode = cVar;
        }
    }

    public TriggerExecutor(@l Expression.MutableExpression<?, Boolean> mutableExpression, @l List<p0> list, @l Expression<mp.c> expression, @l ExpressionResolverImpl expressionResolverImpl, @l ErrorCollector errorCollector, @l Div2Logger div2Logger, @l DivActionBinder divActionBinder) {
        this.expression = mutableExpression;
        this.actions = list;
        this.mode = expression;
        this.resolver = expressionResolverImpl;
        this.errorCollector = errorCollector;
        this.logger = div2Logger;
        this.divActionBinder = divActionBinder;
        this.modeObserver = expression.observeAndGet(expressionResolverImpl, new TriggerExecutor$modeObserver$1(this));
        Disposable disposable = Disposable.NULL;
        this.observersDisposable = disposable;
        this.removingDisposable = disposable;
        this.bindCompletionDisposable = disposable;
        this.attachedViews = new LinkedHashSet();
    }

    private final boolean conditionSatisfied(DivViewFacade divViewFacade) throws Exception {
        RuntimeException runtimeException;
        try {
            Boolean boolEvaluate = this.expression.evaluate(this.resolver);
            boolean zBooleanValue = boolEvaluate.booleanValue();
            Boolean bool = this.wasConditionSatisfied.get(divViewFacade);
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            boolean zBooleanValue2 = bool.booleanValue();
            this.wasConditionSatisfied.put(divViewFacade, boolEvaluate);
            if (zBooleanValue) {
                return (this.currentMode == mp.c.ON_CONDITION && zBooleanValue2) ? false : true;
            }
            return false;
        } catch (Exception e10) {
            if (e10 instanceof ClassCastException) {
                runtimeException = new RuntimeException("Condition evaluated in non-boolean result! (expression: '" + this.expression.getRawValue() + "')", e10);
            } else {
                if (!(e10 instanceof EvaluableException)) {
                    throw e10;
                }
                runtimeException = new RuntimeException("Condition evaluation failed! (expression: '" + this.expression.getRawValue() + "')", e10);
            }
            this.errorCollector.logError(runtimeException);
            return false;
        }
    }

    private final void invalidateObservation() {
        if (this.attachedViews.isEmpty()) {
            stopObserving();
        } else {
            startObserving();
        }
    }

    private final void startObserving() {
        this.modeObserver.close();
        this.observersDisposable = this.expression.observe(this.resolver, this.changeTrigger);
        this.removingDisposable = this.resolver.getVariableController().subscribeToVariablesUndeclared(this.expression.getVariablesName(this.resolver), new AnonymousClass1());
        this.modeObserver = this.mode.observeAndGet(this.resolver, new AnonymousClass2());
        tryTriggerActions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopObserving() {
        this.modeObserver.close();
        this.observersDisposable.close();
        this.removingDisposable.close();
        this.bindCompletionDisposable.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryTriggerActions() {
        Assert.assertMainThread();
        Iterator<T> it = this.attachedViews.iterator();
        while (it.hasNext()) {
            tryTriggerActions((DivViewFacade) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.yandex.div.core.downloader.PersistentDivDataObserver, com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1] */
    private final void tryTriggerActionsAfterBind(final Div2View div2View) {
        this.bindCompletionDisposable.close();
        final ?? r10 = new PersistentDivDataObserver() { // from class: com.yandex.div.core.expression.triggers.TriggerExecutor$tryTriggerActionsAfterBind$observer$1
            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public void onAfterDivDataChanged() {
                div2View.removePersistentDivDataObserver$div_release(this);
                this.tryTriggerActions();
            }

            @Override // com.yandex.div.core.downloader.PersistentDivDataObserver
            public /* synthetic */ void onBeforeDivDataChanged() {
                c.b(this);
            }
        };
        this.bindCompletionDisposable = new Disposable() { // from class: com.yandex.div.core.expression.triggers.a
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                div2View.removePersistentDivDataObserver$div_release(r10);
            }
        };
        div2View.addPersistentDivDataObserver$div_release(r10);
    }

    public final void onAttach(@l DivViewFacade divViewFacade) {
        this.attachedViews.add(divViewFacade);
        invalidateObservation();
    }

    public final void onDetach(@m DivViewFacade divViewFacade) {
        v1.a(this.attachedViews).remove(divViewFacade);
        invalidateObservation();
    }

    private final void tryTriggerActions(DivViewFacade divViewFacade) {
        boolean z10 = divViewFacade instanceof Div2View;
        Div2View div2View = z10 ? (Div2View) divViewFacade : null;
        if (div2View != null) {
            if (!div2View.getInMiddleOfBind$div_release()) {
                div2View = null;
            }
            if (div2View != null) {
                tryTriggerActionsAfterBind(div2View);
                return;
            }
        }
        if (conditionSatisfied(divViewFacade)) {
            for (p0 p0Var : this.actions) {
                Div2View div2View2 = z10 ? (Div2View) divViewFacade : null;
                if (div2View2 != null) {
                    this.logger.logTrigger(div2View2, p0Var);
                }
            }
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, divViewFacade, this.resolver, this.actions, DivActionHandler.DivActionReason.TRIGGER, null, 16, null);
        }
    }
}
