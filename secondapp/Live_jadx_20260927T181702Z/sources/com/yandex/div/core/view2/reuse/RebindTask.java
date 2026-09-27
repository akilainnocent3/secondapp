package com.yandex.div.core.view2.reuse;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.util.RebindTokenUtilsKt;
import com.yandex.div.internal.core.DivCollectionExtensionsKt;
import com.yandex.div.json.expressions.ExpressionResolver;
import fr.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import mq.e0;
import mq.m7;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class RebindTask {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String TAG = "RebindTask";

    @l
    private final Div2View div2View;

    @l
    private final DivBinder divBinder;

    @l
    private final ExpressionResolver newResolver;

    @l
    private final ExpressionResolver oldResolver;
    private boolean rebindInProgress;

    @l
    private final ComplexRebindReporter reporter;

    @l
    private final Set<ExistingToken> bindingPoints = new LinkedHashSet();

    @l
    private final List<ExistingToken> idsToBind = new ArrayList();

    @l
    private final List<ExistingToken> aloneExisting = new ArrayList();

    @l
    private final List<NewToken> aloneNew = new ArrayList();

    @l
    private final Map<String, ExistingToken> aloneIds = new LinkedHashMap();

    @l
    private final ReusableTokenList reusableList = new ReusableTokenList();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class UnsupportedElementException extends IllegalArgumentException {

        @l
        private final String message;

        public UnsupportedElementException(@l Class<?> cls) {
            this.message = cls + " is unsupported by complex rebind";
        }

        @Override // java.lang.Throwable
        @l
        public String getMessage() {
            return this.message;
        }
    }

    public RebindTask(@l Div2View div2View, @l DivBinder divBinder, @l ExpressionResolver expressionResolver, @l ExpressionResolver expressionResolver2, @l ComplexRebindReporter complexRebindReporter) {
        this.div2View = div2View;
        this.divBinder = divBinder;
        this.oldResolver = expressionResolver;
        this.newResolver = expressionResolver2;
        this.reporter = complexRebindReporter;
    }

    private final boolean calculateDiff(m7 m7Var, m7 m7Var2, ViewGroup viewGroup) {
        e0 e0Var;
        e0 e0Var2;
        m7.c cVarStateToBind = this.div2View.stateToBind(m7Var);
        if (cVarStateToBind == null || (e0Var = cVarStateToBind.f111797a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        ExistingToken existingToken = new ExistingToken(DivCollectionExtensionsKt.toItemBuilderResult(e0Var, this.oldResolver), 0, viewGroup, null);
        m7.c cVarStateToBind2 = this.div2View.stateToBind(m7Var2);
        if (cVarStateToBind2 == null || (e0Var2 = cVarStateToBind2.f111797a) == null) {
            this.reporter.onComplexRebindNoDivInState();
            return false;
        }
        NewToken newToken = new NewToken(DivCollectionExtensionsKt.toItemBuilderResult(e0Var2, this.newResolver), 0, null);
        if (existingToken.isCombinable(newToken)) {
            doNodeInSameMode(existingToken, newToken);
        } else {
            doNodeInExistingMode(existingToken);
            doNodeInNewMode(newToken);
        }
        Iterator<T> it = this.aloneNew.iterator();
        while (it.hasNext()) {
            ExistingToken lastExistingParent = ((NewToken) it.next()).getLastExistingParent();
            if (lastExistingParent == null) {
                this.reporter.onComplexRebindNoExistingParent();
                return false;
            }
            this.reusableList.remove(lastExistingParent);
            this.bindingPoints.add(lastExistingParent);
        }
        return true;
    }

    private final void doNodeInExistingMode(ExistingToken existingToken) {
        String id2 = existingToken.getDiv().d().getId();
        if (id2 != null) {
            this.aloneIds.put(id2, existingToken);
        } else {
            this.aloneExisting.add(existingToken);
        }
        Iterator it = ExistingToken.getChildrenTokens$default(existingToken, null, 1, null).iterator();
        while (it.hasNext()) {
            doNodeInExistingMode((ExistingToken) it.next());
        }
    }

    private final void doNodeInNewMode(NewToken newToken) {
        Object next;
        Iterator<T> it = this.aloneExisting.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ExistingToken) next).isCombinable(newToken));
        ExistingToken existingToken = (ExistingToken) next;
        if (existingToken != null) {
            this.aloneExisting.remove(existingToken);
            doNodeInSameMode(existingToken, newToken);
            return;
        }
        String id2 = newToken.getDiv().d().getId();
        ExistingToken existingToken2 = id2 != null ? this.aloneIds.get(id2) : null;
        if (id2 == null || existingToken2 == null || !m0.g(existingToken2.getDiv().getClass(), newToken.getDiv().getClass()) || !DivComparator.areValuesReplaceable$default(DivComparator.INSTANCE, existingToken2.getDiv().d(), newToken.getDiv().d(), this.oldResolver, this.newResolver, null, 16, null)) {
            this.aloneNew.add(newToken);
        } else {
            this.aloneIds.remove(id2);
            this.idsToBind.add(RebindTokenUtilsKt.combineTokens(existingToken2, newToken));
        }
        Iterator<T> it2 = newToken.getChildrenTokens().iterator();
        while (it2.hasNext()) {
            doNodeInNewMode((NewToken) it2.next());
        }
    }

    private final void doNodeInSameMode(ExistingToken existingToken, NewToken newToken) {
        Object next;
        ExistingToken existingTokenCombineTokens = RebindTokenUtilsKt.combineTokens(existingToken, newToken);
        newToken.setLastExistingParent(existingTokenCombineTokens);
        List listD6 = r0.d6(newToken.getChildrenTokens());
        ArrayList arrayList = new ArrayList();
        for (ExistingToken existingToken2 : existingToken.getChildrenTokens(existingTokenCombineTokens)) {
            Iterator it = listD6.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((NewToken) next).isCombinable(existingToken2));
            NewToken newToken2 = (NewToken) next;
            if (newToken2 != null) {
                doNodeInSameMode(existingToken2, newToken2);
                listD6.remove(newToken2);
            } else {
                arrayList.add(existingToken2);
            }
        }
        if (listD6.size() != arrayList.size()) {
            this.bindingPoints.add(existingTokenCombineTokens);
        } else {
            this.reusableList.add(existingTokenCombineTokens);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            doNodeInExistingMode((ExistingToken) it2.next());
        }
        Iterator it3 = listD6.iterator();
        while (it3.hasNext()) {
            doNodeInNewMode((NewToken) it3.next());
        }
    }

    @j0
    private final boolean rebind(DivStatePath divStatePath) {
        if (this.bindingPoints.isEmpty() && this.reusableList.isEmpty()) {
            this.reporter.onComplexRebindNothingToBind();
            return false;
        }
        for (ExistingToken existingToken : this.aloneExisting) {
            releaseIfNecessary(existingToken.getDiv(), existingToken.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken.getView());
        }
        for (ExistingToken existingToken2 : this.aloneIds.values()) {
            releaseIfNecessary(existingToken2.getDiv(), existingToken2.getView());
            this.div2View.unbindViewFromDiv$div_release(existingToken2.getView());
        }
        for (ExistingToken existingToken3 : this.bindingPoints) {
            if (!r0.a2(this.bindingPoints, existingToken3.getParentToken())) {
                BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(existingToken3.getView());
                if (bindingContext == null) {
                    bindingContext = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext, existingToken3.getView(), existingToken3.getItem().getDiv(), divStatePath);
            }
        }
        for (ExistingToken existingToken4 : this.idsToBind) {
            if (!r0.a2(this.bindingPoints, existingToken4.getParentToken())) {
                BindingContext bindingContext2 = BaseDivViewExtensionsKt.getBindingContext(existingToken4.getView());
                if (bindingContext2 == null) {
                    bindingContext2 = this.div2View.getBindingContext$div_release();
                }
                this.divBinder.bind(bindingContext2, existingToken4.getView(), existingToken4.getItem().getDiv(), divStatePath);
            }
        }
        clear();
        this.reporter.onComplexRebindSuccess();
        return true;
    }

    private final void releaseIfNecessary(e0 e0Var, View view) {
        if (e0Var instanceof e0.d ? true : e0Var instanceof e0.s) {
            this.div2View.getReleaseViewVisitor$div_release().visit(view);
        }
    }

    public final void clear() {
        this.rebindInProgress = false;
        this.reusableList.clear();
        this.bindingPoints.clear();
        this.aloneExisting.clear();
        this.aloneNew.clear();
    }

    public final boolean getRebindInProgress() {
        return this.rebindInProgress;
    }

    @l
    public final ReusableTokenList getReusableList() {
        return this.reusableList;
    }

    public final boolean prepareAndRebind(@l m7 m7Var, @l m7 m7Var2, @l ViewGroup viewGroup, @l DivStatePath divStatePath) {
        boolean zCalculateDiff;
        clear();
        this.rebindInProgress = true;
        try {
            zCalculateDiff = calculateDiff(m7Var, m7Var2, viewGroup);
        } catch (UnsupportedElementException e10) {
            this.reporter.onComplexRebindUnsupportedElementException(e10);
            zCalculateDiff = false;
        }
        if (zCalculateDiff) {
            return rebind(divStatePath);
        }
        return false;
    }

    public final void setRebindInProgress(boolean z10) {
        this.rebindInProgress = z10;
    }
}
