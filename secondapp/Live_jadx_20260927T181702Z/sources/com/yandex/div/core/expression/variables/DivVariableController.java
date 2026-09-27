package com.yandex.div.core.expression.variables;

import android.os.Handler;
import android.os.Looper;
import com.yandex.div.data.Variable;
import com.yandex.div.data.VariableDeclarationException;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.Assert;
import cv.d0;
import dr.w2;
import fr.a0;
import fr.h0;
import fr.i0;
import fr.r0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivVariableController {

    @l
    private final ConcurrentLinkedQueue<DeclarationObserver> declarationObservers;

    @l
    private final Set<String> declaredVariableNames;

    @l
    private final ConcurrentLinkedQueue<ds.l<String, w2>> externalVariableRequestObservers;

    @m
    private final DivVariableController internalVariableController;

    @l
    private final Handler mainHandler;

    @l
    private final Set<String> pendingDeclaration;

    @l
    private final ds.l<String, w2> requestsObserver;

    @l
    private final Map<String, String> undeclaredVariables;

    @l
    private final MultiVariableSource variableSource;

    @l
    private final ConcurrentHashMap<String, Variable> variables;

    /* JADX WARN: Multi-variable type inference failed */
    public DivVariableController() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void declare$lambda$3(DivVariableController divVariableController, Variable[] variableArr) {
        divVariableController.putOrUpdateInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
    }

    private final boolean isDeclaredLocal(String str) {
        boolean zContains;
        synchronized (this.declaredVariableNames) {
            zContains = this.declaredVariableNames.contains(str);
        }
        return zContains;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void putOrUpdate$lambda$5(DivVariableController divVariableController, Variable[] variableArr) {
        divVariableController.putOrUpdateInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
    }

    private final void putOrUpdateInternal(Variable... variableArr) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.declaredVariableNames) {
            try {
                for (Variable variable : variableArr) {
                    String str = this.undeclaredVariables.get(variable.getName());
                    if (str != null && !m0.g(str, variable.getClass().getName())) {
                        throw new VariableMutationException("Cannot declare new variable with type = " + variable.getClass().getName() + ", because this variable have been declared with another type = " + str, null, 2, null);
                    }
                    if (!this.declaredVariableNames.contains(variable.getName())) {
                        this.declaredVariableNames.add(variable.getName());
                        this.pendingDeclaration.remove(variable.getName());
                        arrayList.add(variable);
                    }
                    Variable variable2 = this.variables.get(variable.getName());
                    if (variable2 != null) {
                        variable2.setValue(variable);
                        variable.addObserver(new DivVariableController$putOrUpdateInternal$1$1$1$1(variable2));
                    } else {
                        Variable variablePut = this.variables.put(variable.getName(), variable);
                        if (variablePut != null) {
                            Assert.fail(d0.v("\n                    Wanted to put new variable '" + variable + "', but variable with such name\n                    already exists '" + variablePut + "'! Is there a race?\n                "));
                        }
                        this.undeclaredVariables.remove(variable.getName());
                    }
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        for (DeclarationObserver declarationObserver : this.declarationObservers) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                declarationObserver.onDeclared((Variable) it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeAll$lambda$7(DivVariableController divVariableController, String[] strArr) {
        divVariableController.removeVariableInternal((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    private final void removeVariableInternal(String... strArr) {
        ConcurrentHashMap<String, Variable> concurrentHashMap = this.variables;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Variable> entry : concurrentHashMap.entrySet()) {
            if (a0.B8(strArr, entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        synchronized (this.declaredVariableNames) {
            try {
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    this.declaredVariableNames.remove(entry2.getKey());
                    this.undeclaredVariables.put((String) entry2.getKey(), entry2.getValue().getClass().getName());
                    this.variables.remove(entry2.getKey());
                }
                w2 w2Var = w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (DeclarationObserver declarationObserver : this.declarationObservers) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                declarationObserver.onUndeclared((Variable) ((Map.Entry) it.next()).getValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void replaceAll$lambda$6(DivVariableController divVariableController, Variable[] variableArr) {
        divVariableController.replaceAllInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
    }

    private final void replaceAllInternal(Variable... variableArr) {
        ConcurrentHashMap<String, Variable> concurrentHashMap = this.variables;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Variable>> it = concurrentHashMap.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Variable> next = it.next();
            int length = variableArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if (m0.g(next.getKey(), variableArr[i10].getName())) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Collection<?> collectionValues = linkedHashMap.values();
        List listEz = a0.ez(variableArr);
        listEz.removeAll(collectionValues);
        Collection<?> collection = collectionValues;
        ArrayList arrayList = new ArrayList(i0.d0(collection, 10));
        Iterator<T> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Variable) it2.next()).getName());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            removeVariableInternal((String) it3.next());
        }
        Iterator it4 = listEz.iterator();
        while (it4.hasNext()) {
            putOrUpdateInternal((Variable) it4.next());
        }
    }

    public final void addDeclarationObserver$div_release(@l DeclarationObserver declarationObserver) {
        this.declarationObservers.add(declarationObserver);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addDeclarationObserver$div_release(declarationObserver);
        }
    }

    public final void addVariableObserver$div_release(@l ds.l<? super Variable, w2> lVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).addObserver(lVar);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableObserver$div_release(lVar);
        }
    }

    public final void addVariableRequestObserver(@l ds.l<? super String, w2> lVar) {
        this.externalVariableRequestObservers.add(lVar);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.addVariableRequestObserver(lVar);
        }
    }

    @l
    public final List<Variable> captureAllVariables() {
        List<Variable> listJ;
        Collection<Variable> collectionValues = this.variables.values();
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController == null || (listJ = divVariableController.captureAllVariables()) == null) {
            listJ = h0.J();
        }
        return r0.I4(collectionValues, listJ);
    }

    public final void declare(@l final Variable... variableArr) throws VariableDeclarationException {
        synchronized (this.declaredVariableNames) {
            try {
                ArrayList arrayList = new ArrayList();
                for (Variable variable : variableArr) {
                    if (this.declaredVariableNames.contains(variable.getName()) || this.pendingDeclaration.contains(variable.getName())) {
                        arrayList.add(variable);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new VariableDeclarationException(d0.v("\n                        Wanted to declare new variable(s) '" + arrayList + "',\n                        but variable(s) with such name(s) already exists!\n                    "), null, 2, null);
                }
                Set<String> set = this.pendingDeclaration;
                ArrayList arrayList2 = new ArrayList(variableArr.length);
                for (Variable variable2 : variableArr) {
                    arrayList2.add(variable2.getName());
                }
                set.addAll(arrayList2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (m0.g(this.mainHandler.getLooper(), Looper.myLooper())) {
            putOrUpdateInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.b
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.declare$lambda$3(this.f76540b, variableArr);
                }
            });
        }
    }

    @m
    public final Variable get(@l String str) {
        if (isDeclaredLocal(str)) {
            return this.variables.get(str);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            return divVariableController.get(str);
        }
        return null;
    }

    @l
    public final MultiVariableSource getVariableSource$div_release() {
        return this.variableSource;
    }

    public final boolean isDeclared(@l String str) {
        boolean z10;
        DivVariableController divVariableController;
        synchronized (this.declaredVariableNames) {
            z10 = true;
            if (!isDeclaredLocal(str) && ((divVariableController = this.internalVariableController) == null || !divVariableController.isDeclared(str))) {
                z10 = false;
            }
        }
        return z10;
    }

    public final void putOrUpdate(@l final Variable... variableArr) throws VariableMutationException {
        if (m0.g(this.mainHandler.getLooper(), Looper.myLooper())) {
            putOrUpdateInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.c
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.putOrUpdate$lambda$5(this.f76542b, variableArr);
                }
            });
        }
    }

    public final void receiveVariablesUpdates$div_release(@l ds.l<? super Variable, w2> lVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            lVar.invoke((Variable) it.next());
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.receiveVariablesUpdates$div_release(lVar);
        }
    }

    public final void removeAll(@l final String... strArr) {
        if (m0.g(this.mainHandler.getLooper(), Looper.myLooper())) {
            removeVariableInternal((String[]) Arrays.copyOf(strArr, strArr.length));
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.a
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.removeAll$lambda$7(this.f76538b, strArr);
                }
            });
        }
    }

    public final void removeDeclarationObserver$div_release(@l DeclarationObserver declarationObserver) {
        this.declarationObservers.remove(declarationObserver);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeDeclarationObserver$div_release(declarationObserver);
        }
    }

    public final void removeVariableRequestObserver(@l ds.l<? super String, w2> lVar) {
        this.externalVariableRequestObservers.remove(lVar);
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariableRequestObserver(lVar);
        }
    }

    public final void removeVariablesObserver$div_release(@l ds.l<? super Variable, w2> lVar) {
        Iterator<T> it = this.variables.values().iterator();
        while (it.hasNext()) {
            ((Variable) it.next()).removeObserver(lVar);
        }
        DivVariableController divVariableController = this.internalVariableController;
        if (divVariableController != null) {
            divVariableController.removeVariablesObserver$div_release(lVar);
        }
    }

    public final void replaceAll(@l final Variable... variableArr) throws VariableMutationException {
        if (m0.g(this.mainHandler.getLooper(), Looper.myLooper())) {
            replaceAllInternal((Variable[]) Arrays.copyOf(variableArr, variableArr.length));
        } else {
            this.mainHandler.post(new Runnable() { // from class: com.yandex.div.core.expression.variables.d
                @Override // java.lang.Runnable
                public final void run() {
                    DivVariableController.replaceAll$lambda$6(this.f76544b, variableArr);
                }
            });
        }
    }

    public DivVariableController(@m DivVariableController divVariableController) {
        this.internalVariableController = divVariableController;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.variables = new ConcurrentHashMap<>();
        this.declarationObservers = new ConcurrentLinkedQueue<>();
        this.undeclaredVariables = new LinkedHashMap();
        this.declaredVariableNames = new LinkedHashSet();
        this.pendingDeclaration = new LinkedHashSet();
        this.externalVariableRequestObservers = new ConcurrentLinkedQueue<>();
        DivVariableController$requestsObserver$1 divVariableController$requestsObserver$1 = new DivVariableController$requestsObserver$1(this);
        this.requestsObserver = divVariableController$requestsObserver$1;
        this.variableSource = new MultiVariableSource(this, divVariableController$requestsObserver$1);
    }

    public /* synthetic */ DivVariableController(DivVariableController divVariableController, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : divVariableController);
    }
}
