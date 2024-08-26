"use strict";
(self.webpackChunkrunning = self.webpackChunkrunning || []).push([[98], {
    24098: (ft,I,a)=>{
        a.r(I),
        a.d(I, {
            AuthModule: ()=>Ot,
            options: ()=>Pt
        });
        var d = a(41543)
          , c = a(93075)
          , x = a(10195);
        const N = [{
            title: "Admin :: Login",
            icon: "ion-ios-pulse",
            link: "/login/clinicas",
            home: !0
        }, {
            title: "Cl\xednicas :: Login",
            icon: "ion-ios-pricetags-outline",
            link: "/login/clinicas",
            home: !1
        }];
        var t = a(5e3)
          , y = a(76955)
          , F = a(89641)
          , u = a(74202)
          , q = a(6405);
        let E = (()=>{
            class o {
                constructor(n, e) {
                    this.generalService = n,
                    this.storageService = e,
                    this.menu = N
                }
                ngOnInit() {
                    this.storageService.restoreObject("home_config") ? this.generalService.home$.next(this.storageService.restoreObject("home_config")) : this.generalService.home().then(n=>{
                        this.storageService.storeObject(n, "home_config")
                    }
                    )
                }
            }
            return o.\u0275fac = function(n) {
                return new (n || o)(t.\u0275\u0275directiveInject(y.m),t.\u0275\u0275directiveInject(F.V))
            }
            ,
            o.\u0275cmp = t.\u0275\u0275defineComponent({
                type: o,
                selectors: [["edm-auth"]],
                decls: 2,
                vars: 1,
                consts: [[3, "showFooterHeader"]],
                template: function(n, e) {
                    1 & n && (t.\u0275\u0275elementStart(0, "ngx-one-column-layout", 0),
                    t.\u0275\u0275element(1, "router-outlet"),
                    t.\u0275\u0275elementEnd()),
                    2 & n && t.\u0275\u0275property("showFooterHeader", !1)
                },
                dependencies: [u.lC, q.s],
                encapsulation: 2
            }),
            o
        }
        )();
        var b = a(92667)
          , v = a(98215)
          , V = a(53713)
          , H = a(16111)
          , z = a(44083)
          , w = a(6360)
          , P = a(28551)
          , O = a(56213)
          , R = a(17144)
          , h = a(90508)
          , D = a(63191)
          , Z = a(83368);
        function k(o, i, n) {
            return i = (0,
            z.Z)(i),
            (0,
            V.Z)(o, (0,
            H.Z)() ? Reflect.construct(i, n || [], (0,
            z.Z)(o).constructor) : i.apply(o, n))
        }
        var U = ["input"]
          , J = function(i) {
            return {
                enterDuration: i
            }
        }
          , Q = ["*"]
          , G = new t.InjectionToken("mat-slide-toggle-default-options",{
            providedIn: "root",
            factory: function() {
                return {
                    disableToggleValue: !1
                }
            }
        })
          , $ = 0
          , W = {
            provide: c.JU,
            useExisting: (0,
            t.forwardRef)(function() {
                return L
            }),
            multi: !0
        }
          , K = (0,
        P.Z)(function o(i, n) {
            (0,
            O.Z)(this, o),
            this.source = i,
            this.checked = n
        })
          , Y = (0,
        h.sb)((0,
        h.pj)((0,
        h.Kr)((0,
        h.Id)((0,
        P.Z)(function o(i) {
            (0,
            O.Z)(this, o),
            this._elementRef = i
        })))))
          , X = function() {
            var o = function(i) {
                function n(e, r, l, g, p, m, _) {
                    var s;
                    return (0,
                    O.Z)(this, n),
                    (s = k(this, n, [e]))._focusMonitor = r,
                    s._changeDetectorRef = l,
                    s.defaults = p,
                    s._onChange = function(wt) {}
                    ,
                    s._onTouched = function() {}
                    ,
                    s._required = !1,
                    s._checked = !1,
                    s.name = null,
                    s.labelPosition = "after",
                    s.ariaLabel = null,
                    s.ariaLabelledby = null,
                    s.change = new t.EventEmitter,
                    s.toggleChange = new t.EventEmitter,
                    s.tabIndex = parseInt(g) || 0,
                    s.color = s.defaultColor = p.color || "accent",
                    s._noopAnimations = "NoopAnimations" === m,
                    s.id = s._uniqueId = "".concat(_).concat(++$),
                    s
                }
                return (0,
                w.Z)(n, i),
                (0,
                P.Z)(n, [{
                    key: "required",
                    get: function() {
                        return this._required
                    },
                    set: function(r) {
                        this._required = (0,
                        D.Ig)(r)
                    }
                }, {
                    key: "checked",
                    get: function() {
                        return this._checked
                    },
                    set: function(r) {
                        this._checked = (0,
                        D.Ig)(r),
                        this._changeDetectorRef.markForCheck()
                    }
                }, {
                    key: "inputId",
                    get: function() {
                        return "".concat(this.id || this._uniqueId, "-input")
                    }
                }, {
                    key: "ngAfterContentInit",
                    value: function() {
                        var r = this;
                        this._focusMonitor.monitor(this._elementRef, !0).subscribe(function(l) {
                            "keyboard" === l || "program" === l ? r._focused = !0 : l || Promise.resolve().then(function() {
                                r._focused = !1,
                                r._onTouched(),
                                r._changeDetectorRef.markForCheck()
                            })
                        })
                    }
                }, {
                    key: "ngOnDestroy",
                    value: function() {
                        this._focusMonitor.stopMonitoring(this._elementRef)
                    }
                }, {
                    key: "writeValue",
                    value: function(r) {
                        this.checked = !!r
                    }
                }, {
                    key: "registerOnChange",
                    value: function(r) {
                        this._onChange = r
                    }
                }, {
                    key: "registerOnTouched",
                    value: function(r) {
                        this._onTouched = r
                    }
                }, {
                    key: "setDisabledState",
                    value: function(r) {
                        this.disabled = r,
                        this._changeDetectorRef.markForCheck()
                    }
                }, {
                    key: "toggle",
                    value: function() {
                        this.checked = !this.checked,
                        this._onChange(this.checked)
                    }
                }, {
                    key: "_emitChangeEvent",
                    value: function() {
                        this._onChange(this.checked),
                        this.change.emit(this._createChangeEvent(this.checked))
                    }
                }])
            }(Y);
            return o.\u0275fac = function(n) {
                t.\u0275\u0275invalidFactory()
            }
            ,
            o.\u0275dir = t.\u0275\u0275defineDirective({
                type: o,
                inputs: {
                    name: "name",
                    id: "id",
                    labelPosition: "labelPosition",
                    ariaLabel: ["aria-label", "ariaLabel"],
                    ariaLabelledby: ["aria-labelledby", "ariaLabelledby"],
                    ariaDescribedby: ["aria-describedby", "ariaDescribedby"],
                    required: "required",
                    checked: "checked"
                },
                outputs: {
                    change: "change",
                    toggleChange: "toggleChange"
                },
                features: [t.\u0275\u0275InheritDefinitionFeature]
            }),
            o
        }()
          , L = function() {
            var o = function(i) {
                function n(e, r, l, g, p, m) {
                    return (0,
                    O.Z)(this, n),
                    k(this, n, [e, r, l, g, p, m, "mat-slide-toggle-"])
                }
                return (0,
                w.Z)(n, i),
                (0,
                P.Z)(n, [{
                    key: "_createChangeEvent",
                    value: function(r) {
                        return new K(this,r)
                    }
                }, {
                    key: "_onChangeEvent",
                    value: function(r) {
                        r.stopPropagation(),
                        this.toggleChange.emit(),
                        this.defaults.disableToggleValue ? this._inputElement.nativeElement.checked = this.checked : (this.checked = this._inputElement.nativeElement.checked,
                        this._emitChangeEvent())
                    }
                }, {
                    key: "_onInputClick",
                    value: function(r) {
                        r.stopPropagation()
                    }
                }, {
                    key: "focus",
                    value: function(r, l) {
                        l ? this._focusMonitor.focusVia(this._inputElement, l, r) : this._inputElement.nativeElement.focus(r)
                    }
                }, {
                    key: "_onLabelTextChange",
                    value: function() {
                        this._changeDetectorRef.detectChanges()
                    }
                }])
            }(X);
            return o.\u0275fac = function(n) {
                return new (n || o)(t.\u0275\u0275directiveInject(t.ElementRef),t.\u0275\u0275directiveInject(Z.tE),t.\u0275\u0275directiveInject(t.ChangeDetectorRef),t.\u0275\u0275injectAttribute("tabindex"),t.\u0275\u0275directiveInject(G),t.\u0275\u0275directiveInject(t.ANIMATION_MODULE_TYPE, 8))
            }
            ,
            o.\u0275cmp = t.\u0275\u0275defineComponent({
                type: o,
                selectors: [["mat-slide-toggle"]],
                viewQuery: function(n, e) {
                    var r;
                    1 & n && t.\u0275\u0275viewQuery(U, 5),
                    2 & n && t.\u0275\u0275queryRefresh(r = t.\u0275\u0275loadQuery()) && (e._inputElement = r.first)
                },
                hostAttrs: [1, "mat-slide-toggle"],
                hostVars: 13,
                hostBindings: function(n, e) {
                    2 & n && (t.\u0275\u0275hostProperty("id", e.id),
                    t.\u0275\u0275attribute("tabindex", null)("aria-label", null)("aria-labelledby", null)("name", null),
                    t.\u0275\u0275classProp("mat-checked", e.checked)("mat-disabled", e.disabled)("mat-slide-toggle-label-before", "before" == e.labelPosition)("_mat-animation-noopable", e._noopAnimations))
                },
                inputs: {
                    disabled: "disabled",
                    disableRipple: "disableRipple",
                    color: "color",
                    tabIndex: "tabIndex"
                },
                exportAs: ["matSlideToggle"],
                features: [t.\u0275\u0275ProvidersFeature([W]), t.\u0275\u0275InheritDefinitionFeature],
                ngContentSelectors: Q,
                decls: 14,
                vars: 20,
                consts: [[1, "mat-slide-toggle-label"], ["label", ""], [1, "mat-slide-toggle-bar"], ["type", "checkbox", "role", "switch", 1, "mat-slide-toggle-input", "cdk-visually-hidden", 3, "id", "required", "tabIndex", "checked", "disabled", "change", "click"], ["input", ""], [1, "mat-slide-toggle-thumb-container"], [1, "mat-slide-toggle-thumb"], ["mat-ripple", "", 1, "mat-slide-toggle-ripple", "mat-focus-indicator", 3, "matRippleTrigger", "matRippleDisabled", "matRippleCentered", "matRippleRadius", "matRippleAnimation"], [1, "mat-ripple-element", "mat-slide-toggle-persistent-ripple"], [1, "mat-slide-toggle-content", 3, "cdkObserveContent"], ["labelContent", ""], [2, "display", "none"]],
                template: function(n, e) {
                    if (1 & n && (t.\u0275\u0275projectionDef(),
                    t.\u0275\u0275elementStart(0, "label", 0, 1)(2, "span", 2)(3, "input", 3, 4),
                    t.\u0275\u0275listener("change", function(p) {
                        return e._onChangeEvent(p)
                    })("click", function(p) {
                        return e._onInputClick(p)
                    }),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(5, "span", 5),
                    t.\u0275\u0275element(6, "span", 6),
                    t.\u0275\u0275elementStart(7, "span", 7),
                    t.\u0275\u0275element(8, "span", 8),
                    t.\u0275\u0275elementEnd()()(),
                    t.\u0275\u0275elementStart(9, "span", 9, 10),
                    t.\u0275\u0275listener("cdkObserveContent", function() {
                        return e._onLabelTextChange()
                    }),
                    t.\u0275\u0275elementStart(11, "span", 11),
                    t.\u0275\u0275text(12, "\xa0"),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275projection(13),
                    t.\u0275\u0275elementEnd()()),
                    2 & n) {
                        var r = t.\u0275\u0275reference(1)
                          , l = t.\u0275\u0275reference(10);
                        t.\u0275\u0275attribute("for", e.inputId),
                        t.\u0275\u0275advance(2),
                        t.\u0275\u0275classProp("mat-slide-toggle-bar-no-side-margin", !l.textContent || !l.textContent.trim()),
                        t.\u0275\u0275advance(1),
                        t.\u0275\u0275property("id", e.inputId)("required", e.required)("tabIndex", e.tabIndex)("checked", e.checked)("disabled", e.disabled),
                        t.\u0275\u0275attribute("name", e.name)("aria-checked", e.checked)("aria-label", e.ariaLabel)("aria-labelledby", e.ariaLabelledby)("aria-describedby", e.ariaDescribedby),
                        t.\u0275\u0275advance(4),
                        t.\u0275\u0275property("matRippleTrigger", r)("matRippleDisabled", e.disableRipple || e.disabled)("matRippleCentered", !0)("matRippleRadius", 20)("matRippleAnimation", t.\u0275\u0275pureFunction1(18, J, e._noopAnimations ? 0 : 150))
                    }
                },
                dependencies: [h.wG, R.wD],
                styles: ['.mat-slide-toggle{display:inline-block;height:24px;max-width:100%;line-height:24px;white-space:nowrap;outline:none;-webkit-tap-highlight-color:rgba(0,0,0,0)}.mat-slide-toggle.mat-checked .mat-slide-toggle-thumb-container{transform:translate3d(16px, 0, 0)}[dir=rtl] .mat-slide-toggle.mat-checked .mat-slide-toggle-thumb-container{transform:translate3d(-16px, 0, 0)}.mat-slide-toggle.mat-disabled{opacity:.38}.mat-slide-toggle.mat-disabled .mat-slide-toggle-label,.mat-slide-toggle.mat-disabled .mat-slide-toggle-thumb-container{cursor:default}.mat-slide-toggle-label{-webkit-user-select:none;user-select:none;display:flex;flex:1;flex-direction:row;align-items:center;height:inherit;cursor:pointer}.mat-slide-toggle-content{white-space:nowrap;overflow:hidden;text-overflow:ellipsis}.mat-slide-toggle-label-before .mat-slide-toggle-label{order:1}.mat-slide-toggle-label-before .mat-slide-toggle-bar{order:2}[dir=rtl] .mat-slide-toggle-label-before .mat-slide-toggle-bar,.mat-slide-toggle-bar{margin-right:8px;margin-left:0}[dir=rtl] .mat-slide-toggle-bar,.mat-slide-toggle-label-before .mat-slide-toggle-bar{margin-left:8px;margin-right:0}.mat-slide-toggle-bar-no-side-margin{margin-left:0;margin-right:0}.mat-slide-toggle-thumb-container{position:absolute;z-index:1;width:20px;height:20px;top:-3px;left:0;transform:translate3d(0, 0, 0);transition:all 80ms linear;transition-property:transform}._mat-animation-noopable .mat-slide-toggle-thumb-container{transition:none}[dir=rtl] .mat-slide-toggle-thumb-container{left:auto;right:0}.mat-slide-toggle-thumb{height:20px;width:20px;border-radius:50%;display:block}.mat-slide-toggle-bar{position:relative;width:36px;height:14px;flex-shrink:0;border-radius:8px}.mat-slide-toggle-input{bottom:0;left:10px}[dir=rtl] .mat-slide-toggle-input{left:auto;right:10px}.mat-slide-toggle-bar,.mat-slide-toggle-thumb{transition:all 80ms linear;transition-property:background-color;transition-delay:50ms}._mat-animation-noopable .mat-slide-toggle-bar,._mat-animation-noopable .mat-slide-toggle-thumb{transition:none}.mat-slide-toggle .mat-slide-toggle-ripple{position:absolute;top:calc(50% - 20px);left:calc(50% - 20px);height:40px;width:40px;z-index:1;pointer-events:none}.mat-slide-toggle .mat-slide-toggle-ripple .mat-ripple-element:not(.mat-slide-toggle-persistent-ripple){opacity:.12}.mat-slide-toggle-persistent-ripple{width:100%;height:100%;transform:none}.mat-slide-toggle-bar:hover .mat-slide-toggle-persistent-ripple{opacity:.04}.mat-slide-toggle:not(.mat-disabled).cdk-keyboard-focused .mat-slide-toggle-persistent-ripple{opacity:.12}.mat-slide-toggle-persistent-ripple,.mat-slide-toggle.mat-disabled .mat-slide-toggle-bar:hover .mat-slide-toggle-persistent-ripple{opacity:0}@media(hover: none){.mat-slide-toggle-bar:hover .mat-slide-toggle-persistent-ripple{display:none}}.mat-slide-toggle-input:focus~.mat-slide-toggle-thumb-container .mat-focus-indicator::before{content:""}.cdk-high-contrast-active .mat-slide-toggle-thumb,.cdk-high-contrast-active .mat-slide-toggle-bar{border:1px solid}'],
                encapsulation: 2,
                changeDetection: 0
            }),
            o
        }()
          , A = function() {
            var o = (0,
            P.Z)(function i() {
                (0,
                O.Z)(this, i)
            });
            return o.\u0275fac = function(n) {
                return new (n || o)
            }
            ,
            o.\u0275mod = t.\u0275\u0275defineNgModule({
                type: o
            }),
            o.\u0275inj = t.\u0275\u0275defineInjector({}),
            o
        }()
          , et = function() {
            var o = (0,
            P.Z)(function i() {
                (0,
                O.Z)(this, i)
            });
            return o.\u0275fac = function(n) {
                return new (n || o)
            }
            ,
            o.\u0275mod = t.\u0275\u0275defineNgModule({
                type: o
            }),
            o.\u0275inj = t.\u0275\u0275defineInjector({
                imports: [A, h.si, h.BQ, R.Q8, A, h.BQ]
            }),
            o
        }()
          , f = a(69808)
          , M = a(45422);
        let ot = (()=>{
            class o {
                constructor(n, e, r) {
                    this.activeModal = n,
                    this.layoutService = e,
                    this.generalService = r,
                    this.managing = !1,
                    this.pathBaseTranslate = "auth.cookieconsent.",
                    this.authCookies = !0,
                    this.generalService.home$.subscribe(g=>{
                        this.exists(g) && (this.privacy = g.privacy)
                    }
                    );
                    const l = document.getElementsByTagName("meta");
                    if (null != l && l.length > 0)
                        for (let g = 0; g < l.length; g++) {
                            const p = l[g]
                              , m = p.getAttribute("name");
                            if (null !== m && "" != m && "theme-color" == m) {
                                const _ = p.getAttribute("content");
                                null !== _ && "" != _ && (this.themeColor = _)
                            }
                        }
                }
                getTranslate(n) {
                    return this.generalService.getTranslate(`${this.pathBaseTranslate}${n}`)
                }
                exists(n) {
                    return null != n && "" != n
                }
                buttonCustomLayoutCss() {
                    return this.layoutService.buttonCustomLayoutCss()
                }
                iconTypeLayoutClass() {
                    return b.g.iconsType + "-icons-type"
                }
            }
            return o.\u0275fac = function(n) {
                return new (n || o)(t.\u0275\u0275directiveInject(x.Kz),t.\u0275\u0275directiveInject(v.P),t.\u0275\u0275directiveInject(y.m))
            }
            ,
            o.\u0275cmp = t.\u0275\u0275defineComponent({
                type: o,
                selectors: [["edm-cookieconsent"]],
                inputs: {
                    authCookies: "authCookies"
                },
                decls: 30,
                vars: 37,
                consts: [[1, "modal-header", 3, "ngClass"], [1, "fas", "fa-cookie"], [1, "modal-body"], [1, "form-group", "row"], [1, "col-sm-12"], ["target", "_blank", 3, "href"], [1, "switch", 3, "checked", "ngModel", "ngModelChange"], [1, "modal-footer"], ["type", "button", 1, "btn", "btn-danger", "small-btn", 3, "ngClass", "click"], ["type", "button", 1, "btn", "btn-success", "small-btn", 3, "ngClass", "click"]],
                template: function(n, e) {
                    1 & n && (t.\u0275\u0275elementStart(0, "div", 0)(1, "span"),
                    t.\u0275\u0275element(2, "i", 1),
                    t.\u0275\u0275text(3),
                    t.\u0275\u0275elementEnd()(),
                    t.\u0275\u0275elementStart(4, "div", 2)(5, "div", 3)(6, "div", 4)(7, "div")(8, "p"),
                    t.\u0275\u0275text(9),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(10, "p"),
                    t.\u0275\u0275text(11),
                    t.\u0275\u0275elementStart(12, "a", 5),
                    t.\u0275\u0275text(13),
                    t.\u0275\u0275elementEnd()()(),
                    t.\u0275\u0275elementStart(14, "div")(15, "p")(16, "strong"),
                    t.\u0275\u0275text(17),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275element(18, "br")(19, "br"),
                    t.\u0275\u0275text(20),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(21, "mat-slide-toggle", 6),
                    t.\u0275\u0275listener("ngModelChange", function(l) {
                        return e.authCookies = l
                    }),
                    t.\u0275\u0275text(22),
                    t.\u0275\u0275elementEnd()()()()(),
                    t.\u0275\u0275elementStart(23, "div", 7)(24, "button", 8),
                    t.\u0275\u0275listener("click", function() {
                        return e.managing = !0
                    }),
                    t.\u0275\u0275text(25),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(26, "button", 9),
                    t.\u0275\u0275listener("click", function() {
                        return e.activeModal.close(e.authCookies)
                    }),
                    t.\u0275\u0275text(27),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(28, "button", 9),
                    t.\u0275\u0275listener("click", function() {
                        return e.managing = !1
                    }),
                    t.\u0275\u0275text(29),
                    t.\u0275\u0275elementEnd()()),
                    2 & n && (t.\u0275\u0275property("ngClass", e.iconTypeLayoutClass()),
                    t.\u0275\u0275advance(3),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("title"), " "),
                    t.\u0275\u0275advance(4),
                    t.\u0275\u0275styleProp("display", e.managing ? "none" : "block"),
                    t.\u0275\u0275advance(2),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("description"), " "),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275styleProp("display", e.exists(e.privacy) ? "block" : "none"),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("privacyPolicyLabel"), " "),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275property("href", e.privacy, t.\u0275\u0275sanitizeUrl),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("privacyPolicyLink"), " "),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275styleProp("display", e.managing ? "block" : "none"),
                    t.\u0275\u0275advance(3),
                    t.\u0275\u0275textInterpolate1("\u2022 ", e.getTranslate("authConfigCookies.title"), ""),
                    t.\u0275\u0275advance(3),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("authConfigCookies.description"), " "),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275property("checked", e.authCookies)("ngModel", e.authCookies),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("authConfigCookies.toggleLabel"), " "),
                    t.\u0275\u0275advance(2),
                    t.\u0275\u0275styleProp("display", e.managing ? "none" : "flex")("border", "1px solid transparent")("margin-right", "10px"),
                    t.\u0275\u0275property("ngClass", e.buttonCustomLayoutCss()),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("managePreferencesButton"), " "),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275styleProp("display", e.managing ? "none" : "flex")("border", "1px solid transparent"),
                    t.\u0275\u0275property("ngClass", e.buttonCustomLayoutCss()),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("allowButton"), " "),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275styleProp("display", e.managing ? "flex" : "none")("border", "1px solid transparent"),
                    t.\u0275\u0275property("ngClass", e.buttonCustomLayoutCss()),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate1(" ", e.getTranslate("backButton"), " "))
                },
                dependencies: [c.JJ, c.On, L, f.NgClass, M.mh],
                styles: ["nb-card.full-height[_ngcontent-%COMP%]{margin:0;border:0;border-radius:0;min-height:100vh;border:none}nb-card[_ngcontent-%COMP%]   nb-card-body.form-wrapper[_ngcontent-%COMP%]{display:flex;opacity:.9;background:transparent;z-index:2}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]{display:flex;flex-direction:column;height:auto;flex-basis:auto;margin:1rem auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]:first-child{margin-top:auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]:last-child{margin-bottom:auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]{width:100%}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   .logo-img[_ngcontent-%COMP%]{width:100%;max-width:300px;margin:auto auto 20px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   .logo-img.reduced-logo[_ngcontent-%COMP%]{max-width:120px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   a[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   span[_ngcontent-%COMP%]{cursor:pointer}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo.background-logo[_ngcontent-%COMP%]{width:300px;height:300px;display:block;background-position:center;background-repeat:no-repeat;background-size:cover;background-attachment:scroll;margin:1rem auto;border-radius:150px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo.background-logo.reduced-logo[_ngcontent-%COMP%]{width:120px;height:120px;border-radius:60px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input[_ngcontent-%COMP%]{background-clip:padding-box;border-width:1px;border-style:solid;border-radius:.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control.transparent[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input.transparent[_ngcontent-%COMP%]{border-top:none;border-left:none;border-right:none;border-radius:0;background-color:transparent!important}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control.transparent[_ngcontent-%COMP%]:focus, nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input.transparent[_ngcontent-%COMP%]:focus{outline:none;box-shadow:none}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]{margin:3.6rem 0 4.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{text-align:center;font-size:30px;font-weight:700}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h3[_ngcontent-%COMP%]{text-align:center;font-size:12px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-text[_ngcontent-%COMP%]{display:block;margin-top:.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-text.sub-title[_ngcontent-%COMP%]{padding:2rem 0;text-align:center;font-size:1rem}@media only screen and (max-width: 767px){nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]{margin:1.8rem 0 3.3rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{font-size:22px}}.btn[_ngcontent-%COMP%]{width:auto;padding:1.25rem 3.75rem;margin:1.875rem auto}.btn.small-btn[_ngcontent-%COMP%]{margin:auto 0;padding:.675rem 1.925rem}.btn.centered-btn[_ngcontent-%COMP%]{margin:auto}.images-icons-type[_ngcontent-%COMP%]   button.close[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:1em;height:1em}"]
            }),
            o
        }
        )();
        var C = a(26682)
          , rt = a(92340)
          , T = a(9070)
          , S = a(20773)
          , j = a(76796);
        function it(o, i) {
            if (1 & o && t.\u0275\u0275element(0, "edm-back-button", 19),
            2 & o) {
                const n = t.\u0275\u0275nextContext();
                t.\u0275\u0275property("backUrl", n.redirectQueryParam)
            }
        }
        function at(o, i) {
            if (1 & o) {
                const n = t.\u0275\u0275getCurrentView();
                t.\u0275\u0275elementStart(0, "span")(1, "button", 20),
                t.\u0275\u0275listener("click", function() {
                    t.\u0275\u0275restoreView(n);
                    const r = t.\u0275\u0275nextContext();
                    return t.\u0275\u0275resetView(r.goToRegisterPage())
                }),
                t.\u0275\u0275text(2),
                t.\u0275\u0275elementEnd()()
            }
            if (2 & o) {
                const n = t.\u0275\u0275nextContext();
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("ngClass", n.buttonCustomLayoutCss()),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275textInterpolate1(" ", n.getTranslate("registrationButton.signUp"), " ")
            }
        }
        let ct = (()=>{
            class o {
                constructor(n, e, r, l, g, p, m, _) {
                    this.fb = n,
                    this.router = e,
                    this.modal = r,
                    this.loginService = l,
                    this.generalService = g,
                    this.layoutService = p,
                    this.toasterService = m,
                    this.activatedRoute = _,
                    this.transparentInput = !0,
                    this.inAppRegistration = !1,
                    this.registrationButtonText = "Cadastrar",
                    this.authenticating = !1,
                    this.askingForCookieConsent = !1,
                    this.redirect = ["produtos"],
                    this.pathBaseTranslate = "auth.login.",
                    this.ngbModalOptions = {
                        backdrop: !1,
                        keyboard: !1,
                        centered: !0
                    },
                    this.config = new C.vc({
                        positionClass: "toast-top-right",
                        timeout: 5e3,
                        newestOnTop: !0,
                        tapToDismiss: !0,
                        preventDuplicates: !1,
                        animation: "fade",
                        limit: 5
                    }),
                    this.inAppRegistration = b.g.inAppRegistration,
                    this.registrationButtonText = b.g.registrationButtonText,
                    this.readRegistrationConfig(),
                    this.initConsent(),
                    this.createForm(),
                    this.activatedRoute.queryParams.subscribe(s=>{
                        this.exists(s.redirect) && (this.redirectQueryParam = decodeURIComponent(s.redirect),
                        this.redirect = [this.redirectQueryParam]),
                        this.loginService.isAuthenticated() || (this.redirectQueryParam = "/produtos")
                    }
                    , ()=>{}
                    )
                }
                ngOnDestroy() {
                    this.modal.hasOpenModals() && this.modal.dismissAll()
                }
                readRegistrationConfig() {
                    this.generalService.home$.subscribe(n=>{
                        this.exists(n) && (this.inAppRegistration = b.g.inAppRegistration && n.register,
                        this.exists(n.gtm) && this.generalService.loadGTM(n.gtm))
                    }
                    )
                }
                createForm() {
                    this.authForm = this.fb.group({
                        email: ["", [c.kI.required, c.kI.email]],
                        password: ["", c.kI.required]
                    })
                }
                get email() {
                    return this.authForm.get("email")
                }
                get password() {
                    return this.authForm.get("password")
                }
                isFieldValid(n) {
                    return !this.authForm.get(n).valid && this.authForm.get(n).touched
                }
                onSubmit() {
                    this.authForm.valid ? (this.authenticating = !0,
                    this.loginService.login(this.authForm.value.email, this.authForm.value.password).then(n=>{
                        n ? this.loginService.loggedUser().then(e=>{
                            this.loginService.loggedUser$.next(e),
                            this.router.navigate(this.redirect)
                        }
                        ) : (this.authenticating = !1,
                        this.loginService.purge())
                    }
                    ).catch(()=>{
                        this.authenticating = !1,
                        this.loginService.purge()
                    }
                    )) : (this.validateAllFormFields(this.authForm),
                    this.authForm.get("email").errors && this.authForm.get("email").errors.required && this.showToast("warning", this.getTranslate("emailRequiredErrorTitle"), this.getTranslate("emailRequiredErrorBody")),
                    this.authForm.get("email").errors && this.authForm.get("email").errors.email && this.showToast("warning", this.getTranslate("emailInvalidErrorTitle"), this.getTranslate("emailInvalidErrorBody")),
                    this.authForm.get("password").errors && this.authForm.get("password").errors.required && this.showToast("warning", this.getTranslate("passwordRequiredErrorTitle"), this.getTranslate("passwordRequiredErrorBody")))
                }
                validateAllFormFields(n) {
                    Object.keys(n.controls).forEach(e=>{
                        const r = n.get(e);
                        r instanceof c.NI ? r.markAsTouched({
                            onlySelf: !0
                        }) : r instanceof c.cw && this.validateAllFormFields(r)
                    }
                    )
                }
                initConsent() {
                    this.loginService.isCookieConsent() || this.showConsent()
                }
                showConsent() {
                    this.askingForCookieConsent || (this.askingForCookieConsent = !0,
                    this.modal.open(ot, this.ngbModalOptions).result.then(e=>{
                        e && this.loginService.consentCookie()
                    }
                    , ()=>{}
                    ))
                }
                getTranslate(n) {
                    return this.generalService.getTranslate(`${this.pathBaseTranslate}${n}`)
                }
                navigateHome() {
                    return this.router.navigate(["/"]),
                    !1
                }
                goToRegisterPage() {
                    const n = this.exists(this.redirectQueryParam) ? {
                        queryParams: {
                            redirect: encodeURIComponent(this.redirectQueryParam)
                        }
                    } : {};
                    this.router.navigate(["cadastro"], n)
                }
                inputClass() {
                    return this.transparentInput ? "transparent" : ""
                }
                copyright() {
                    const n = new Date(Date.now());
                    return rt.N.appname + " @" + n.getFullYear() + " Todos os direitos reservados."
                }
                exists(n) {
                    return null != n && "" != n
                }
                buttonCustomLayoutCss() {
                    return this.layoutService.buttonCustomLayoutCss()
                }
                showToast(n, e, r) {
                    this.toasterService.popAsync({
                        type: n,
                        title: e,
                        body: r,
                        timeout: 5e3,
                        showCloseButton: !0,
                        bodyOutputType: C.Cm.TrustedHtml
                    })
                }
            }
            return o.\u0275fac = function(n) {
                return new (n || o)(t.\u0275\u0275directiveInject(c.qu),t.\u0275\u0275directiveInject(u.F0),t.\u0275\u0275directiveInject(x.FF),t.\u0275\u0275directiveInject(T.r),t.\u0275\u0275directiveInject(y.m),t.\u0275\u0275directiveInject(v.P),t.\u0275\u0275directiveInject(C.MJ),t.\u0275\u0275directiveInject(u.gz))
            }
            ,
            o.\u0275cmp = t.\u0275\u0275defineComponent({
                type: o,
                selectors: [["edm-auth-form"]],
                decls: 22,
                vars: 17,
                consts: [[3, "toasterconfig"], [1, "full-height"], [1, "form-wrapper"], ["style", "z-index: 1030", "class", "mr-4", 3, "backUrl", 4, "ngIf"], [1, "flex-centered", "col-xl-3", "col-lg-6", "col-md-8", "col-sm-12"], [1, "logo", "text-center"], [3, "click"], ["src", "/assets/images/img-logo-normal.webp", 1, "logo-img"], [1, "text-center", 3, "formGroup", "ngSubmit"], [1, "form-group", "mt-5"], ["type", "email", "id", "inputEmail", "formControlName", "email", "maxlength", "50", 1, "form-control", 3, "ngClass", "placeholder"], [1, "form-group", "mt-4"], ["type", "password", "id", "inputPassword", "formControlName", "password", "maxlength", "50", 1, "form-control", 3, "ngClass", "placeholder"], [1, "form-group"], ["routerLink", "recuperar-senha", 1, "form-text", "sub-title"], ["type", "submit", 1, "btn", "btn-block", "btn-primary", "no-margin-bottom", 3, "disabled", "ngClass"], ["diameter", "20"], [4, "ngIf"], ["id", "copyright", 2, "color", "transparent", 3, "innerHTML"], [1, "mr-4", 2, "z-index", "1030", 3, "backUrl"], ["type", "button", 1, "btn", "btn-block", "btn-registration", "no-margin-bottom", 3, "ngClass", "click"]],
                template: function(n, e) {
                    1 & n && (t.\u0275\u0275element(0, "toaster-container", 0),
                    t.\u0275\u0275elementStart(1, "nb-card", 1)(2, "nb-card-body", 2),
                    t.\u0275\u0275template(3, it, 1, 1, "edm-back-button", 3),
                    t.\u0275\u0275elementStart(4, "div", 4)(5, "div", 5)(6, "a", 6),
                    t.\u0275\u0275listener("click", function() {
                        return e.navigateHome()
                    }),
                    t.\u0275\u0275element(7, "img", 7),
                    t.\u0275\u0275elementEnd()(),
                    t.\u0275\u0275elementStart(8, "form", 8),
                    t.\u0275\u0275listener("ngSubmit", function() {
                        return e.onSubmit()
                    }),
                    t.\u0275\u0275elementStart(9, "div", 9),
                    t.\u0275\u0275element(10, "input", 10),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(11, "div", 11),
                    t.\u0275\u0275element(12, "input", 12),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275elementStart(13, "div", 13)(14, "a", 14),
                    t.\u0275\u0275text(15),
                    t.\u0275\u0275elementEnd()(),
                    t.\u0275\u0275elementStart(16, "button", 15)(17, "span"),
                    t.\u0275\u0275text(18),
                    t.\u0275\u0275elementEnd(),
                    t.\u0275\u0275element(19, "mat-spinner", 16),
                    t.\u0275\u0275elementEnd()(),
                    t.\u0275\u0275template(20, at, 3, 2, "span", 17),
                    t.\u0275\u0275element(21, "div", 18),
                    t.\u0275\u0275elementEnd()()()),
                    2 & n && (t.\u0275\u0275property("toasterconfig", e.config),
                    t.\u0275\u0275advance(3),
                    t.\u0275\u0275property("ngIf", e.exists(e.redirectQueryParam)),
                    t.\u0275\u0275advance(5),
                    t.\u0275\u0275property("formGroup", e.authForm),
                    t.\u0275\u0275advance(2),
                    t.\u0275\u0275propertyInterpolate("placeholder", e.getTranslate("emailPlaceholder")),
                    t.\u0275\u0275property("ngClass", e.inputClass()),
                    t.\u0275\u0275advance(2),
                    t.\u0275\u0275propertyInterpolate("placeholder", e.getTranslate("passwordPlaceholder")),
                    t.\u0275\u0275property("ngClass", e.inputClass()),
                    t.\u0275\u0275advance(3),
                    t.\u0275\u0275textInterpolate(e.getTranslate("forgotPassword")),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275property("disabled", e.authForm.pristine)("ngClass", e.buttonCustomLayoutCss()),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275styleProp("display", e.authenticating ? "none" : "block"),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275textInterpolate(e.getTranslate("loginButton")),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275styleProp("display", e.authenticating ? "block" : "none"),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275property("ngIf", e.inAppRegistration),
                    t.\u0275\u0275advance(1),
                    t.\u0275\u0275property("innerHTML", e.copyright(), t.\u0275\u0275sanitizeHtml))
                },
                dependencies: [u.yS, C.fr, S.Ou, d.Asz, d.yKW, c._Y, c.Fj, c.JJ, c.JL, c.nD, c.sg, c.u, j.W, f.NgClass, f.NgIf, M.mh],
                styles: ["nb-card.full-height[_ngcontent-%COMP%]{margin:0;border:0;border-radius:0;min-height:100vh;border:none}nb-card[_ngcontent-%COMP%]   nb-card-body.form-wrapper[_ngcontent-%COMP%]{display:flex;opacity:.9;background:transparent;z-index:2}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]{display:flex;flex-direction:column;height:auto;flex-basis:auto;margin:1rem auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]:first-child{margin-top:auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]:last-child{margin-bottom:auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]{width:100%}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   .logo-img[_ngcontent-%COMP%]{width:100%;max-width:300px;margin:auto auto 20px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   .logo-img.reduced-logo[_ngcontent-%COMP%]{max-width:120px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   a[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   span[_ngcontent-%COMP%]{cursor:pointer}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo.background-logo[_ngcontent-%COMP%]{width:300px;height:300px;display:block;background-position:center;background-repeat:no-repeat;background-size:cover;background-attachment:scroll;margin:1rem auto;border-radius:150px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo.background-logo.reduced-logo[_ngcontent-%COMP%]{width:120px;height:120px;border-radius:60px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input[_ngcontent-%COMP%]{background-clip:padding-box;border-width:1px;border-style:solid;border-radius:.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control.transparent[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input.transparent[_ngcontent-%COMP%]{border-top:none;border-left:none;border-right:none;border-radius:0;background-color:transparent!important}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control.transparent[_ngcontent-%COMP%]:focus, nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input.transparent[_ngcontent-%COMP%]:focus{outline:none;box-shadow:none}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]{margin:3.6rem 0 4.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{text-align:center;font-size:30px;font-weight:700}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h3[_ngcontent-%COMP%]{text-align:center;font-size:12px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-text[_ngcontent-%COMP%]{display:block;margin-top:.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-text.sub-title[_ngcontent-%COMP%]{padding:2rem 0;text-align:center;font-size:1rem}@media only screen and (max-width: 767px){nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]{margin:1.8rem 0 3.3rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{font-size:22px}}.btn[_ngcontent-%COMP%]{width:auto;padding:1.25rem 3.75rem;margin:1.875rem auto}.btn.small-btn[_ngcontent-%COMP%]{margin:auto 0;padding:.675rem 1.925rem}.btn.centered-btn[_ngcontent-%COMP%]{margin:auto}.images-icons-type[_ngcontent-%COMP%]   button.close[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:1em;height:1em}.form-wrapper[_ngcontent-%COMP%]{flex-direction:column;align-items:flex-start}.no-margin-bottom[_ngcontent-%COMP%]{margin-bottom:0!important}.btn[_ngcontent-%COMP%]{min-width:215px}"]
            }),
            o
        }
        )();
        var B = a(91470);
        const lt = function(o, i) {
            return [o, i]
        };
        function st(o, i) {
            if (1 & o) {
                const n = t.\u0275\u0275getCurrentView();
                t.\u0275\u0275elementStart(0, "div", 8)(1, "div", 9)(2, "a", 10),
                t.\u0275\u0275element(3, "img", 11),
                t.\u0275\u0275elementEnd()(),
                t.\u0275\u0275elementStart(4, "div", 12)(5, "h2"),
                t.\u0275\u0275text(6),
                t.\u0275\u0275elementEnd(),
                t.\u0275\u0275elementStart(7, "h3", 13),
                t.\u0275\u0275text(8),
                t.\u0275\u0275elementEnd()(),
                t.\u0275\u0275elementStart(9, "form", 14),
                t.\u0275\u0275listener("ngSubmit", function() {
                    t.\u0275\u0275restoreView(n);
                    const r = t.\u0275\u0275nextContext();
                    return t.\u0275\u0275resetView(r.onSubmit())
                }),
                t.\u0275\u0275elementStart(10, "div", 15),
                t.\u0275\u0275element(11, "input", 16),
                t.\u0275\u0275elementEnd(),
                t.\u0275\u0275elementStart(12, "div", 17),
                t.\u0275\u0275element(13, "input", 18),
                t.\u0275\u0275elementEnd(),
                t.\u0275\u0275elementStart(14, "div", 17),
                t.\u0275\u0275element(15, "ngx-intl-tel-input", 19),
                t.\u0275\u0275elementEnd(),
                t.\u0275\u0275elementStart(16, "button", 20)(17, "span"),
                t.\u0275\u0275text(18),
                t.\u0275\u0275elementEnd(),
                t.\u0275\u0275element(19, "mat-spinner", 21),
                t.\u0275\u0275elementEnd()()()
            }
            if (2 & o) {
                const n = t.\u0275\u0275nextContext();
                t.\u0275\u0275advance(6),
                t.\u0275\u0275textInterpolate(n.getTranslate("title")),
                t.\u0275\u0275advance(2),
                t.\u0275\u0275textInterpolate(n.getTranslate("description")),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("formGroup", n.authForm),
                t.\u0275\u0275advance(2),
                t.\u0275\u0275propertyInterpolate("placeholder", n.getTranslate("emailPlaceholder")),
                t.\u0275\u0275property("ngClass", n.inputClass()),
                t.\u0275\u0275advance(2),
                t.\u0275\u0275propertyInterpolate("placeholder", n.getTranslate("cpfPlaceholder")),
                t.\u0275\u0275property("ngClass", n.inputClass())("mask", n.isBrazilian && "000.000.000-00"),
                t.\u0275\u0275advance(2),
                t.\u0275\u0275property("cssClass", "form-control")("enableAutoCountrySelect", !0)("enablePlaceholder", !0)("customPlaceholder", "DDD + Telefone")("searchCountryFlag", !0)("searchCountryField", t.\u0275\u0275pureFunction2(30, lt, n.SearchCountryField.Iso2, n.SearchCountryField.Name))("selectFirstCountry", !1)("selectedCountryISO", n.CountryISO.Brazil)("maxLength", 15)("phoneValidation", !0)("separateDialCode", n.separateDialCode)("numberFormat", n.PhoneNumberFormat.National)("searchCountryPlaceholder", n.getTranslate("searchCountryLabel")),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("disabled", n.authForm.pristine)("ngClass", n.buttonCustomLayoutCss()),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275styleProp("display", n.authenticating ? "none" : "block"),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275textInterpolate(n.getTranslate("submitButton")),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275styleProp("display", n.authenticating ? "block" : "none")("margin", "auto")
            }
        }
        function dt(o, i) {
            if (1 & o && t.\u0275\u0275element(0, "h3", 25),
            2 & o) {
                const n = t.\u0275\u0275nextContext(2);
                t.\u0275\u0275property("innerHTML", n.passwordTip, t.\u0275\u0275sanitizeHtml)
            }
        }
        function gt(o, i) {
            if (1 & o) {
                const n = t.\u0275\u0275getCurrentView();
                t.\u0275\u0275elementStart(0, "button", 30),
                t.\u0275\u0275listener("click", function() {
                    t.\u0275\u0275restoreView(n);
                    const r = t.\u0275\u0275nextContext(2);
                    return t.\u0275\u0275resetView(r.continue(r.passwordError))
                }),
                t.\u0275\u0275elementStart(1, "span"),
                t.\u0275\u0275text(2),
                t.\u0275\u0275elementEnd(),
                t.\u0275\u0275element(3, "mat-spinner", 21),
                t.\u0275\u0275elementEnd()
            }
            if (2 & o) {
                const n = t.\u0275\u0275nextContext(2);
                t.\u0275\u0275advance(1),
                t.\u0275\u0275styleProp("display", n.gettingData ? "none" : "block"),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275textInterpolate(n.getTranslate("okButton")),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275styleProp("display", n.gettingData ? "block" : "none")("margin", "auto")
            }
        }
        function pt(o, i) {
            if (1 & o && (t.\u0275\u0275elementStart(0, "a", 31)(1, "span"),
            t.\u0275\u0275text(2),
            t.\u0275\u0275elementEnd(),
            t.\u0275\u0275element(3, "mat-spinner", 21),
            t.\u0275\u0275elementEnd()),
            2 & o) {
                const n = t.\u0275\u0275nextContext(2);
                t.\u0275\u0275propertyInterpolate1("href", "https://wa.me/", n.whatsappcontact, "", t.\u0275\u0275sanitizeUrl),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275styleProp("display", n.gettingData ? "none" : "block"),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275textInterpolate(n.getTranslate("contactButton")),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275styleProp("display", n.gettingData ? "block" : "none")("margin", "auto")
            }
        }
        function mt(o, i) {
            if (1 & o && (t.\u0275\u0275elementStart(0, "a", 32),
            t.\u0275\u0275text(1),
            t.\u0275\u0275elementEnd()),
            2 & o) {
                const n = t.\u0275\u0275nextContext(2);
                t.\u0275\u0275advance(1),
                t.\u0275\u0275textInterpolate(n.getTranslate("cancelLink"))
            }
        }
        function Ct(o, i) {
            if (1 & o && (t.\u0275\u0275elementStart(0, "div", 22)(1, "div", 23),
            t.\u0275\u0275element(2, "h2", 24),
            t.\u0275\u0275elementEnd(),
            t.\u0275\u0275elementStart(3, "div", 12),
            t.\u0275\u0275element(4, "h2", 25),
            t.\u0275\u0275template(5, dt, 1, 1, "h3", 26),
            t.\u0275\u0275elementEnd(),
            t.\u0275\u0275template(6, gt, 4, 7, "button", 27),
            t.\u0275\u0275template(7, pt, 4, 8, "a", 28),
            t.\u0275\u0275template(8, mt, 2, 1, "a", 29),
            t.\u0275\u0275elementEnd()),
            2 & o) {
                const n = t.\u0275\u0275nextContext();
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("ngClass", n.iconTypeLayoutClass()),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("innerHTML", n.passwordIcon, t.\u0275\u0275sanitizeHtml),
                t.\u0275\u0275advance(2),
                t.\u0275\u0275property("innerHTML", n.passwordReturn, t.\u0275\u0275sanitizeHtml),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("ngIf", null != n.passwordTip),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("ngIf", 2 !== n.passwordError),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("ngIf", 2 === n.passwordError && null != n.whatsappcontact),
                t.\u0275\u0275advance(1),
                t.\u0275\u0275property("ngIf", 2 === n.passwordError)
            }
        }
        const ut = [{
            path: "",
            component: E,
            children: [{
                path: "",
                component: ct
            }, {
                path: "recuperar-senha",
                component: (()=>{
                    class o {
                        constructor(n, e, r, l, g, p, m) {
                            this.fb = n,
                            this.router = e,
                            this.loginService = r,
                            this.generalService = l,
                            this.layoutService = g,
                            this.toasterService = p,
                            this.cdr = m,
                            this.authenticating = !1,
                            this.gettingData = !1,
                            this.pathBaseTranslate = "auth.password.",
                            this.transparentInput = !0,
                            this.phoneMasks = ["00 00000", "0000 0000", "000 000 000", "(00) 0000-0000", "(00) 00000-0000", "000 000 000 000", "000 000 000 0000", "0000 000 000 0000", "00000 00000 00000", "0000 0000 0000 0000", "0000 0000 0000 00000", "0000 00000 0000 00000", "00000 00000 0000 000000", "00000 00000 00000 00000"],
                            this.initalPhoneMask = "00 00000 0000",
                            this.minPhoneDigits = 7,
                            this.maxPhoneDigits = 20,
                            this.phoneMask = this.initalPhoneMask,
                            this.separateDialCode = !0,
                            this.SearchCountryField = M.wX,
                            this.CountryISO = M.HT,
                            this.PhoneNumberFormat = M.M9,
                            this.config = new C.vc({
                                positionClass: "toast-top-right",
                                timeout: 5e3,
                                newestOnTop: !0,
                                tapToDismiss: !0,
                                preventDuplicates: !1,
                                animation: "fade",
                                limit: 5
                            }),
                            this.isBrazilian = !1,
                            this.createForm(),
                            "pt-BR" === this.generalService.getBrowserCulture() && (this.isBrazilian = !0)
                        }
                        createForm() {
                            this.authForm = this.fb.group({
                                email: ["", [c.kI.required, c.kI.email]],
                                cpf: "",
                                international_phone: ""
                            })
                        }
                        get email() {
                            return this.authForm.get("email")
                        }
                        get cpf() {
                            return this.authForm.get("cpf")
                        }
                        get international_phone() {
                            return this.authForm.get("international_phone")
                        }
                        isFieldValid(n) {
                            return !this.authForm.get(n).valid && this.authForm.get(n).touched
                        }
                        onSubmit() {
                            if (this.authForm.valid) {
                                const n = {
                                    email: this.authForm.value.email,
                                    cpf: this.authForm.value.cpf,
                                    phonenumber: this.exists(this.authForm.value.international_phone) ? this.authForm.value.international_phone.e164Number : "",
                                    type: "PWA"
                                };
                                this.authenticating || (this.authenticating = !0,
                                this.loginService.resetPassword(n).subscribe(e=>{
                                    null === e.appuser ? 201 === e.status ? (this.passwordError = 1,
                                    this.passwordIcon = '<i class="fas fa-envelope"></i><div class="ci ic-email"></div>',
                                    this.passwordReturn = this.getTranslate("passwordStatus1"),
                                    this.passwordTip = this.getTranslate("passwordTip1"),
                                    this.passwordStatus = 201) : (this.passwordError = 2,
                                    this.passwordIcon = '<i class="fas fa-times-circle"></i><div class="ci ic-not-found"></div>',
                                    this.passwordReturn = this.getTranslate("passwordStatus2"),
                                    this.passwordTip = this.getTranslate("passwordTip2"),
                                    this.passwordStatus = 202,
                                    this.getWhatsapp()) : (this.passwordError = 0,
                                    this.passwordIcon = '<i class="fas fa-check-circle"></i><div class="ci ic-dados-check"></div>',
                                    this.passwordReturn = this.getTranslate("passwordStatus3"),
                                    this.passwordTip = this.getTranslate("passwordTip3") + " <strong>" + e.appuser.plain_password + "</strong>",
                                    this.passwordStatus = 200,
                                    this.passwordClient = e.appuser)
                                }
                                , ()=>{
                                    this.passwordError = 2,
                                    this.passwordIcon = '<i class="fas fa-times-circle"></i><div class="ci ic-not-found"></div>',
                                    this.passwordReturn = this.getTranslate("passwordReturn2"),
                                    this.passwordTip = this.getTranslate("passwordTip2"),
                                    this.passwordStatus = 202,
                                    this.getWhatsapp()
                                }
                                ))
                            } else
                                this.validateAllFormFields(this.authForm),
                                this.authForm.get("email").errors && this.authForm.get("email").errors.required && this.showToast("warning", this.getTranslate("emailRequiredTitle"), this.getTranslate("emailRequiredBody")),
                                this.authForm.get("email").errors && this.authForm.get("email").errors.email && this.showToast("warning", this.getTranslate("emailInvalidTitle"), this.getTranslate("emailInvalidBody")),
                                null !== this.authForm.get("cpf").errors && this.authForm.get("cpf").errors["Mask error"] && this.showToast("warning", this.getTranslate("cpfInvalidTitle"), this.getTranslate("cpfInvalidBody")),
                                null !== this.authForm.get("international_phone").status && "INVALID" == this.authForm.get("international_phone").status && this.showToast("warning", this.getTranslate("phoneInvalidTitle"), this.getTranslate("phoneInvalidBody"))
                        }
                        validateAllFormFields(n) {
                            Object.keys(n.controls).forEach(e=>{
                                const r = n.get(e);
                                r instanceof c.NI ? r.markAsTouched({
                                    onlySelf: !0
                                }) : r instanceof c.cw && this.validateAllFormFields(r)
                            }
                            )
                        }
                        getWhatsapp() {
                            this.generalService.home$.subscribe(n=>{
                                this.exists(n) && (this.whatsappcontact = n.whatsapp)
                            }
                            )
                        }
                        continue(n) {
                            switch (n) {
                            case 0:
                                this.gettingData = !0,
                                this.loginService.forceLogin(this.passwordClient),
                                this.router.navigate(["produtos"]);
                                break;
                            case 1:
                                this.router.navigate(["login"])
                            }
                        }
                        getTranslate(n) {
                            return this.generalService.getTranslate(`${this.pathBaseTranslate}${n}`)
                        }
                        updateMask(n) {
                            const e = n.target.value.replace(/\D/g, "")
                              , r = n.key
                              , l = void 0 !== r && r.replace(/\D/g, "") == r;
                            this.setMask(e.length + (l ? 1 : 0))
                        }
                        updateMaskOnDelete(n) {
                            const e = n.target.value.replace(/\D/g, "");
                            this.setMask(e.length)
                        }
                        setMask(n) {
                            n < 2 ? this.phoneMask = this.initalPhoneMask : n <= this.minPhoneDigits ? this.phoneMask = this.phoneMasks[0] : n <= this.maxPhoneDigits && (this.phoneMask = this.phoneMasks[n - this.minPhoneDigits]),
                            this.cdr.detectChanges()
                        }
                        exists(n) {
                            return null != n && "" !== n
                        }
                        inputClass() {
                            return this.transparentInput ? "transparent" : ""
                        }
                        buttonCustomLayoutCss() {
                            return this.layoutService.buttonCustomLayoutCss()
                        }
                        iconCustomLayoutClass() {
                            return b.g.timelineIconsLayout + "-icon"
                        }
                        iconTypeLayoutClass() {
                            return b.g.iconsType + "-icons-type"
                        }
                        showToast(n, e, r) {
                            this.toasterService.popAsync({
                                type: n,
                                title: e,
                                body: r,
                                timeout: 5e3,
                                showCloseButton: !0,
                                bodyOutputType: C.Cm.TrustedHtml
                            })
                        }
                    }
                    return o.\u0275fac = function(n) {
                        return new (n || o)(t.\u0275\u0275directiveInject(c.qu),t.\u0275\u0275directiveInject(u.F0),t.\u0275\u0275directiveInject(T.r),t.\u0275\u0275directiveInject(y.m),t.\u0275\u0275directiveInject(v.P),t.\u0275\u0275directiveInject(C.MJ),t.\u0275\u0275directiveInject(t.ChangeDetectorRef))
                    }
                    ,
                    o.\u0275cmp = t.\u0275\u0275defineComponent({
                        type: o,
                        selectors: [["edm-password-form"]],
                        decls: 8,
                        vars: 6,
                        consts: [[3, "toasterconfig"], [1, "full-height"], [1, "flex-header", 3, "ngClass"], [1, "flex-centered", "full-width", "wrapper", "no-margin-bottom", 3, "ngClass"], [1, "d-flex", "position-relative", 2, "z-index", "1030", 3, "backUrl"], [1, "form-wrapper"], ["class", "flex-centered col-xl-4 col-lg-8 col-md-10 col-sm-12", 4, "ngIf"], ["class", "flex-centered col-xl-3 col-lg-6 col-md-8 col-sm-12 error-container", 4, "ngIf"], [1, "flex-centered", "col-xl-4", "col-lg-8", "col-md-10", "col-sm-12"], [1, "logo", "text-center"], ["href", "/login"], ["src", "/assets/images/img-logo-normal.webp", 1, "logo-img"], [1, "welcome"], [1, "sub-title", "no-margin-bottom", "no-margin-top"], [1, "text-center", 3, "formGroup", "ngSubmit"], [1, "form-group", "required"], ["type", "email", "id", "inputEmail", "formControlName", "email", "maxlength", "50", 1, "form-control", 3, "ngClass", "placeholder"], [1, "form-group"], ["type", "text", "id", "inputCPF", "formControlName", "cpf", 1, "form-control", 3, "ngClass", "mask", "placeholder"], ["name", "international_phone", "formControlName", "international_phone", 3, "cssClass", "enableAutoCountrySelect", "enablePlaceholder", "customPlaceholder", "searchCountryFlag", "searchCountryField", "selectFirstCountry", "selectedCountryISO", "maxLength", "phoneValidation", "separateDialCode", "numberFormat", "searchCountryPlaceholder"], ["type", "submit", 1, "btn", "btn-block", "btn-primary", 3, "disabled", "ngClass"], ["diameter", "20"], [1, "flex-centered", "col-xl-3", "col-lg-6", "col-md-8", "col-sm-12", "error-container"], [1, "logo", "text-center", 3, "ngClass"], [1, "icon-title", 3, "innerHTML"], [3, "innerHTML"], [3, "innerHTML", 4, "ngIf"], ["class", "btn btn-block btn-primary", 3, "click", 4, "ngIf"], ["class", "btn btn-block btn-primary", "target", "_blank", 3, "href", 4, "ngIf"], ["routerLink", "login", "class", "form-text sub-title", 4, "ngIf"], [1, "btn", "btn-block", "btn-primary", 3, "click"], ["target", "_blank", 1, "btn", "btn-block", "btn-primary", 3, "href"], ["routerLink", "login", 1, "form-text", "sub-title"]],
                        template: function(n, e) {
                            1 & n && (t.\u0275\u0275element(0, "toaster-container", 0),
                            t.\u0275\u0275elementStart(1, "nb-card", 1)(2, "nb-card-header", 2)(3, "div", 3),
                            t.\u0275\u0275element(4, "edm-back-button", 4),
                            t.\u0275\u0275elementEnd()(),
                            t.\u0275\u0275elementStart(5, "nb-card-body", 5),
                            t.\u0275\u0275template(6, st, 20, 33, "div", 6),
                            t.\u0275\u0275template(7, Ct, 9, 7, "div", 7),
                            t.\u0275\u0275elementEnd()()),
                            2 & n && (t.\u0275\u0275property("toasterconfig", e.config),
                            t.\u0275\u0275advance(2),
                            t.\u0275\u0275property("ngClass", e.iconCustomLayoutClass()),
                            t.\u0275\u0275advance(1),
                            t.\u0275\u0275property("ngClass", e.iconTypeLayoutClass()),
                            t.\u0275\u0275advance(1),
                            t.\u0275\u0275property("backUrl", "/"),
                            t.\u0275\u0275advance(2),
                            t.\u0275\u0275property("ngIf", void 0 === e.passwordReturn),
                            t.\u0275\u0275advance(1),
                            t.\u0275\u0275property("ngIf", null != e.passwordReturn))
                        },
                        dependencies: [u.yS, C.fr, S.Ou, d.Asz, d.yKW, d.ndF, c._Y, c.Fj, c.JJ, c.JL, c.nD, c.sg, c.u, B.Z6, j.W, f.NgClass, f.NgIf, M.FV, M.mh],
                        styles: ['@import"https://fonts.googleapis.com/css2?family=Inter:wght@300;600&display=swap";nb-card.full-height[_ngcontent-%COMP%]{margin:0;border:0;border-radius:0;min-height:100vh;border:none}nb-card[_ngcontent-%COMP%]   nb-card-body.form-wrapper[_ngcontent-%COMP%]{display:flex;opacity:.9;background:transparent;z-index:2}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]{display:flex;flex-direction:column;height:auto;flex-basis:auto;margin:1rem auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]:first-child{margin-top:auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]:last-child{margin-bottom:auto}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]{width:100%}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   .logo-img[_ngcontent-%COMP%]{width:100%;max-width:300px;margin:auto auto 20px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   .logo-img.reduced-logo[_ngcontent-%COMP%]{max-width:120px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   a[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo[_ngcontent-%COMP%]   span[_ngcontent-%COMP%]{cursor:pointer}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo.background-logo[_ngcontent-%COMP%]{width:300px;height:300px;display:block;background-position:center;background-repeat:no-repeat;background-size:cover;background-attachment:scroll;margin:1rem auto;border-radius:150px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .logo.background-logo.reduced-logo[_ngcontent-%COMP%]{width:120px;height:120px;border-radius:60px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input[_ngcontent-%COMP%]{background-clip:padding-box;border-width:1px;border-style:solid;border-radius:.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control.transparent[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input.transparent[_ngcontent-%COMP%]{border-top:none;border-left:none;border-right:none;border-radius:0;background-color:transparent!important}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-control.transparent[_ngcontent-%COMP%]:focus, nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   ngx-intl-tel-input.transparent[_ngcontent-%COMP%]:focus{outline:none;box-shadow:none}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]{margin:3.6rem 0 4.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{text-align:center;font-size:30px;font-weight:700}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h3[_ngcontent-%COMP%]{text-align:center;font-size:12px}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-text[_ngcontent-%COMP%]{display:block;margin-top:.25rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .form-text.sub-title[_ngcontent-%COMP%]{padding:2rem 0;text-align:center;font-size:1rem}@media only screen and (max-width: 767px){nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]{margin:1.8rem 0 3.3rem}nb-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .flex-centered[_ngcontent-%COMP%]   .welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{font-size:22px}}.btn[_ngcontent-%COMP%]{width:auto;padding:1.25rem 3.75rem;margin:1.875rem auto}.btn.small-btn[_ngcontent-%COMP%]{margin:auto 0;padding:.675rem 1.925rem}.btn.centered-btn[_ngcontent-%COMP%]{margin:auto}.images-icons-type[_ngcontent-%COMP%]   button.close[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:1em;height:1em}nb-card.thin-card[_ngcontent-%COMP%]{height:20vw;border-radius:10px;overflow:hidden}nb-card.thin-card.outside-title[_ngcontent-%COMP%]{margin-bottom:.75rem}nb-card.large-size.landscape-orientation[_ngcontent-%COMP%]{height:16.75vw}nb-card.large-size.portrait-orientation[_ngcontent-%COMP%]{height:53vw}nb-card.medium-size.landscape-orientation[_ngcontent-%COMP%]{height:12.5vw}nb-card.medium-size.portrait-orientation[_ngcontent-%COMP%]{height:38.85vw}nb-card.small-size.landscape-orientation[_ngcontent-%COMP%]{height:7.75vw}nb-card.small-size.portrait-orientation[_ngcontent-%COMP%]{height:20.15vw}nb-card.no-shadow[_ngcontent-%COMP%]{box-shadow:none!important}nb-card.section-card[_ngcontent-%COMP%]{margin-bottom:0}nb-card.section-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%], nb-card.section-card[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]{padding-bottom:.25rem}nb-card.large-card[_ngcontent-%COMP%]{border-radius:10px;overflow:hidden}nb-card.list-item[_ngcontent-%COMP%]{height:auto!important;border-width:1px!important;border-style:solid!important;border-left:none!important;border-right:none!important;border-bottom:none!important;padding-top:10px;margin-bottom:10px;border-radius:0!important}nb-card.list-item.border-bottom[_ngcontent-%COMP%]{border-bottom-style:solid!important;border-bottom-width:1px!important;border-top:none!important;padding-top:0;margin-bottom:0;padding-bottom:10px;margin-top:10px}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]{padding:0!important;overflow:hidden}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]{font-weight:700;font-size:1rem}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]{font-size:1.25rem!important;display:flex;justify-content:center;align-items:center}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{height:1.25rem;width:1.25rem}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]   .square[_ngcontent-%COMP%]{font-size:.65rem!important;padding:.3rem;border-radius:3px;width:1.25rem;height:1.25rem}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]{display:flex;align-items:center;flex:0 0 100%}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .flex-grow[_ngcontent-%COMP%]{flex-grow:1}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]{display:flex;align-items:center}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .flex-title[_ngcontent-%COMP%]{display:flex;flex-direction:column;font-weight:400}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .flex-title[_ngcontent-%COMP%]   .secondary-title[_ngcontent-%COMP%]{font-size:80%;margin-top:5px;display:flex;align-items:center}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .lesson-icon[_ngcontent-%COMP%], nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .check-info[_ngcontent-%COMP%]{font-size:.8rem;margin-right:.25rem;display:flex}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .lesson-icon[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%], nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .check-info[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:.8rem;height:.8rem}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]   .lesson-thumb[_ngcontent-%COMP%]{display:block;width:107px;height:60px;border-radius:5px;background-repeat:no-repeat;background-attachment:scroll;background-position:center;background-size:cover;margin-right:10px;flex-shrink:0}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]:hover:not(.no-action){cursor:pointer}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]:hover:not(.no-action)   .lesson-title[_ngcontent-%COMP%]{text-decoration:underline}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]{font-size:1.5rem;cursor:pointer}nb-card.list-item[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{height:1.5rem;width:1.5rem}nb-card#product-info[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]{padding:15px}nb-card#product-info[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]{display:none}nb-card#product-info[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]   span[_ngcontent-%COMP%]{flex-grow:1}nb-card#product-info[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]   .open[_ngcontent-%COMP%], nb-card#product-info[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]   .close[_ngcontent-%COMP%]{display:none;text-shadow:none}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]{position:relative;border:none}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   button.btn[_ngcontent-%COMP%]{position:absolute;bottom:4px;right:20px;font-size:32px;height:45px;line-height:0}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   button.btn[_ngcontent-%COMP%]   span[_ngcontent-%COMP%]{position:relative}nb-card[_ngcontent-%COMP%]   nb-card-header.flex-header[_ngcontent-%COMP%]{display:flex;align-items:center}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   .header-title[_ngcontent-%COMP%]{font-size:110%;line-height:2rem;text-indent:0;justify-content:flex-start;text-align:left;display:flex;text-transform:none;cursor:pointer;align-items:center}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   .header-title[_ngcontent-%COMP%]   .main[_ngcontent-%COMP%]{margin:0 65px 0 1rem}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   .header-title[_ngcontent-%COMP%]   .flex-title[_ngcontent-%COMP%]{display:flex;align-items:center}nb-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   .header-title[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{padding:0;margin:0}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]{display:flex;flex-direction:column;padding:0}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]{background-position:center;background-size:cover;position:relative;border-top-left-radius:.17rem;border-top-right-radius:.17rem;flex:1;display:flex;flex-direction:column}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]{display:flex;flex-direction:row;align-items:center}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]   .info-free[_ngcontent-%COMP%]{flex-grow:0;margin:.5rem;padding:.3rem;border-radius:4px}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]   .info-spacer[_ngcontent-%COMP%]{flex-grow:1}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]{flex-grow:0;margin:0rem;font-size:1.5rem;cursor:pointer}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{height:1.5rem;width:1.5rem}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]   .info-about.square-icon[_ngcontent-%COMP%]{font-size:1rem;margin:.75rem .75rem 0 0;padding:0;height:2.35rem;display:flex;width:2.35rem;border-radius:10px;justify-content:center;align-items:center;opacity:.85}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]   .info-about.square-icon[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{height:1rem;width:1rem}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]{padding:1.25rem;flex-grow:1;display:flex;justify-content:flex-end;flex-direction:column;cursor:pointer}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details.tiny-info[_ngcontent-%COMP%]{padding:.75rem}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]{font-weight:700;font-size:1rem;text-align:left}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]{display:flex;align-items:flex-end}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]{flex-grow:1}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]   .lesson-icon[_ngcontent-%COMP%]{font-size:1.5rem;margin-left:1rem;display:flex}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]   .lesson-icon[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:1.5rem;height:1.5rem}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]   .lesson-icon.bordered-icon[_ngcontent-%COMP%]{font-size:1rem;margin:0;padding:0;height:2.35rem;display:flex;width:2.35rem;border-radius:10px;justify-content:center;align-items:center;opacity:.85}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]   .lesson-icon.bordered-icon[_ngcontent-%COMP%]   i[_ngcontent-%COMP%]{text-shadow:2px 2px 3px #939598}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   .lesson[_ngcontent-%COMP%]   .lesson-icon.bordered-icon[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:1rem;height:1rem}nb-card.showcase[_ngcontent-%COMP%]   nb-card-body[_ngcontent-%COMP%]   .picture[_ngcontent-%COMP%]   .details[_ngcontent-%COMP%]   .description[_ngcontent-%COMP%]{text-align:justify;font-weight:400;overflow:hidden;text-overflow:ellipsis;margin-top:1rem}nb-card[_ngcontent-%COMP%]   nb-card-footer[_ngcontent-%COMP%]{display:flex;justify-content:space-around;padding:0 0 .75rem;border:none}nb-card[_ngcontent-%COMP%]   nb-card-footer[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]{text-decoration:none}nb-card[_ngcontent-%COMP%]   nb-card-footer[_ngcontent-%COMP%]   a[_ngcontent-%COMP%]   i[_ngcontent-%COMP%]{font-size:1.75rem}nb-card[_ngcontent-%COMP%]   nb-card-footer[_ngcontent-%COMP%]   .btn[_ngcontent-%COMP%]:not(.btn-success):not(.btn-social-media){border:none;background-color:transparent;padding-top:0;padding-bottom:0;cursor:pointer}nb-card[_ngcontent-%COMP%]   nb-card-footer[_ngcontent-%COMP%]   .btn[_ngcontent-%COMP%]:hover{box-shadow:0 0 2px 2px #f0f0f0;-moz-box-shadow:0 0 2px 2px #f0f0f0;opacity:.85}nb-card[_ngcontent-%COMP%]   nb-card-footer[_ngcontent-%COMP%]   i[_ngcontent-%COMP%]{font-size:1.75rem}nb-card.images-icons-type[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%], nb-card[_ngcontent-%COMP%]   .images-icons-type[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:1.5rem;height:1.5rem}nb-card-header[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]{font-size:1.5rem;display:flex;justify-content:flex-start;align-items:center}nb-card-header[_ngcontent-%COMP%]   .header-btn.absolute-btn[_ngcontent-%COMP%]{position:absolute;left:0;top:0}nb-card-header[_ngcontent-%COMP%]   .header-btn.login-btn[_ngcontent-%COMP%]{font-size:30px}nb-card-header[_ngcontent-%COMP%]   .square-icon[_ngcontent-%COMP%]   .header-btn.square[_ngcontent-%COMP%], nb-card-header[_ngcontent-%COMP%]   .square-icon[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .square[_ngcontent-%COMP%], nb-card-header.square-icon[_ngcontent-%COMP%]   .header-btn.square[_ngcontent-%COMP%], nb-card-header.square-icon[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .square[_ngcontent-%COMP%]{font-size:.9rem;padding:.3rem;width:1.5rem;justify-content:center;height:1.5rem;border-radius:5px}nb-card-header[_ngcontent-%COMP%]   .square-icon[_ngcontent-%COMP%]   .header-btn.square-icon[_ngcontent-%COMP%], nb-card-header.square-icon[_ngcontent-%COMP%]   .header-btn.square-icon[_ngcontent-%COMP%]{justify-content:center;text-align:center}nb-card-header[_ngcontent-%COMP%]   .square-icon[_ngcontent-%COMP%]   .header-btn.rounded[_ngcontent-%COMP%], nb-card-header[_ngcontent-%COMP%]   .square-icon[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .rounded[_ngcontent-%COMP%], nb-card-header.square-icon[_ngcontent-%COMP%]   .header-btn.rounded[_ngcontent-%COMP%], nb-card-header.square-icon[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .rounded[_ngcontent-%COMP%]{display:none}nb-card-header[_ngcontent-%COMP%]   .rounded-icon[_ngcontent-%COMP%]   .header-btn.square[_ngcontent-%COMP%], nb-card-header[_ngcontent-%COMP%]   .rounded-icon[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .square[_ngcontent-%COMP%], nb-card-header.rounded-icon[_ngcontent-%COMP%]   .header-btn.square[_ngcontent-%COMP%], nb-card-header.rounded-icon[_ngcontent-%COMP%]   .header-btn[_ngcontent-%COMP%]   .square[_ngcontent-%COMP%]{display:none}nb-card-header[_ngcontent-%COMP%]   .full-width[_ngcontent-%COMP%]{width:100%}nb-card-header[_ngcontent-%COMP%]   .wrapper[_ngcontent-%COMP%]{position:relative}#product-info[_ngcontent-%COMP%]   .accordion-content[_ngcontent-%COMP%], .product-header[_ngcontent-%COMP%]   .accordion-content[_ngcontent-%COMP%]{font-size:14px;line-height:1.38}#product-info[_ngcontent-%COMP%]   .lesson-thumb-card[_ngcontent-%COMP%], .product-header[_ngcontent-%COMP%]   .lesson-thumb-card[_ngcontent-%COMP%]{position:relative}#product-info[_ngcontent-%COMP%]   .lesson-thumb-card[_ngcontent-%COMP%]   .accordion-thumb[_ngcontent-%COMP%], .product-header[_ngcontent-%COMP%]   .lesson-thumb-card[_ngcontent-%COMP%]   .accordion-thumb[_ngcontent-%COMP%]{display:block;width:100%;padding-top:55.6%;background-attachment:scroll;background-repeat:repeat;background-position:center;background-size:cover;border-radius:5px;margin-bottom:15px}#product-info[_ngcontent-%COMP%]   .lesson-thumb-card[_ngcontent-%COMP%]   .thumb-overlay-mask[_ngcontent-%COMP%], .product-header[_ngcontent-%COMP%]   .lesson-thumb-card[_ngcontent-%COMP%]   .thumb-overlay-mask[_ngcontent-%COMP%]{display:block;position:absolute;z-index:200;width:100%;height:100%;left:0;top:0}.outside-title-wrapper[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]{margin-bottom:1.75rem}.outside-title-wrapper[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]   h5[_ngcontent-%COMP%]{display:flex}.certificate[_ngcontent-%COMP%]{display:flex;position:absolute;width:100%;height:100%;top:0;left:0;align-items:center;justify-content:center}.certificate[_ngcontent-%COMP%]   .certificate-text[_ngcontent-%COMP%]{display:flex;flex-direction:column;justify-content:center;align-items:center}.certificate[_ngcontent-%COMP%]   .certificate-text[_ngcontent-%COMP%]   .certificate-icon[_ngcontent-%COMP%]{font-size:2rem;display:block;position:relative}.certificate[_ngcontent-%COMP%]   .certificate-text[_ngcontent-%COMP%]   .certificate-icon[_ngcontent-%COMP%]   .float-icon[_ngcontent-%COMP%]{top:-.25rem;left:-.25rem;font-size:1rem;position:relative}.certificate[_ngcontent-%COMP%]   .certificate-text[_ngcontent-%COMP%]   .certificate-congrats[_ngcontent-%COMP%]{font-size:1.25rem;text-align:center;padding:1.25rem 2.5rem;font-weight:700;line-height:1.25}.certificate[_ngcontent-%COMP%]   .certificate-text[_ngcontent-%COMP%]   .certificate-cta[_ngcontent-%COMP%]{font-size:.875rem;cursor:pointer;line-height:1.1}@media only screen and (max-width: 767px){.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%], .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n+1){padding-left:0!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%], .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n){padding-right:0!important}div.lesson-card.outside-title[_ngcontent-%COMP%]{flex-direction:revert;display:flex;margin-bottom:1rem;padding-bottom:1rem;padding-right:0;padding-left:0;margin-right:15px;margin-left:15px;flex-basis:calc(100% - 30px);border-width:1px;border-style:solid;border-color:#0000001a;border-left:none;border-right:none;border-top:none}div.lesson-card.outside-title[_ngcontent-%COMP%]:last-child{border-bottom:none}div.lesson-card.outside-title[_ngcontent-%COMP%]   nb-card.lesson-card[_ngcontent-%COMP%]{width:30%;margin-right:10px;box-shadow:none!important;margin-bottom:0;border-radius:3px}div.lesson-card.outside-title[_ngcontent-%COMP%]   nb-card.lesson-card.landscape-orientation[_ngcontent-%COMP%]{height:14vw}div.lesson-card.outside-title[_ngcontent-%COMP%]   nb-card.lesson-card[_ngcontent-%COMP%]   .card-info[_ngcontent-%COMP%]{display:none}div.lesson-card.outside-title[_ngcontent-%COMP%]   .outside-title-wrapper[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]{margin-bottom:0}}@media only screen and (min-width: 768px){.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%], .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n+1){padding-left:15px!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%], .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n){padding-right:15px!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n+1), .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(4n+1){padding-left:0!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n), .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(4n){padding-right:0!important}.showcase[_ngcontent-%COMP%]:hover{transform:scale(1.025);-webkit-transform:scale(1.025);-moz-transform:scale(1.025);transition:.1s;-webkit-transition:.1s;-moz-transition:.1s}}@media only screen and (min-width: 1200px){.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n+1), .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(4n+1){padding-left:15px!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(2n), .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(4n){padding-right:15px!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(3n+1), .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(6n+1){padding-left:0!important}.horizontal[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(3n), .vertical[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:nth-child(6n){padding-right:0!important}}@media only screen and (min-width: 2100px){.col-xl-3[_ngcontent-%COMP%]{flex:0 0 16.66666667%}}@media only screen and (max-width: 767px){nb-card-header[_ngcontent-%COMP%], nb-card-header[_ngcontent-%COMP%]   img[_ngcontent-%COMP%]{width:100%}.col-xs-6[_ngcontent-%COMP%]{width:50%!important}.col.portrait-orientation[_ngcontent-%COMP%]{flex:0 0 36%;height:auto;padding:0 5px!important}.col.portrait-orientation[_ngcontent-%COMP%]   nb-card.portrait-orientation[_ngcontent-%COMP%]{height:50vw}.col.landscape-orientation[_ngcontent-%COMP%]{flex:0 0 85%;height:auto;padding:0 5px!important}.col.landscape-orientation[_ngcontent-%COMP%]   nb-card.landscape-orientation[_ngcontent-%COMP%]{height:45.956vw}nb-card.thin-card[_ngcontent-%COMP%]{height:48.5vw}nb-card#product-info.opened[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]{display:flex}nb-card#product-info.opened[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]   .close[_ngcontent-%COMP%]{display:block;opacity:1}nb-card#product-info.closed[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]{display:flex}nb-card#product-info.closed[_ngcontent-%COMP%]   .accordion-flex-title[_ngcontent-%COMP%]   .open[_ngcontent-%COMP%]{display:block;opacity:1}nb-card#product-info.closed[_ngcontent-%COMP%]   .accordion-content[_ngcontent-%COMP%]{display:none}nb-card#product-info[_ngcontent-%COMP%]   .accordion-thumb[_ngcontent-%COMP%]{display:none}nb-card.list-item[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .lesson-title[_ngcontent-%COMP%]{flex-grow:1}nb-card.list-item[_ngcontent-%COMP%]   .product-title[_ngcontent-%COMP%]   .info-about[_ngcontent-%COMP%]{padding-right:0}.list[_ngcontent-%COMP%]   .row[_ngcontent-%COMP%]{margin-left:0;margin-right:0}.list[_ngcontent-%COMP%]   .row[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]{padding:0}.list[_ngcontent-%COMP%]   .row[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:last-child   nb-card.inside-title[_ngcontent-%COMP%]{margin-bottom:8px}.list[_ngcontent-%COMP%]   .row[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]:last-child   .outside-title-wrapper[_ngcontent-%COMP%]   .title[_ngcontent-%COMP%]{margin-bottom:8px}nb-card.section-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]{padding-left:.5rem;padding-right:.5rem}nb-card.section-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   .row[_ngcontent-%COMP%]{margin-left:0;margin-right:0}nb-card.section-card[_ngcontent-%COMP%]   nb-card-header[_ngcontent-%COMP%]   .row[_ngcontent-%COMP%] > div[_ngcontent-%COMP%]{padding:0}}@media screen and (min-width: 768px) and (max-width: 1199px){.col.portrait-orientation[_ngcontent-%COMP%]   nb-card.portrait-orientation[_ngcontent-%COMP%]{height:29.15vw}nb-card.medium-size.landscape-orientation[_ngcontent-%COMP%]{height:17.5vw}}nb-card[_ngcontent-%COMP%]{margin:0}.flex-centered[_ngcontent-%COMP%]{display:flex;flex-direction:column;height:auto;flex-basis:auto;margin:1rem auto}.flex-centered[_ngcontent-%COMP%]:first-child, .flex-centered.error-container[_ngcontent-%COMP%]{margin-top:auto}.flex-centered[_ngcontent-%COMP%]:last-child{margin-bottom:5rem}nb-card-body[_ngcontent-%COMP%]{display:flex;opacity:.9;background:transparent}nb-card[_ngcontent-%COMP%]{border-radius:0;min-height:100vh;border:none}.logo[_ngcontent-%COMP%]{width:100%}.logo[_ngcontent-%COMP%]   .logo-img[_ngcontent-%COMP%]{width:100%;max-width:200px;margin:auto auto 20px}.logo[_ngcontent-%COMP%]   .icon-title[_ngcontent-%COMP%]{font-size:5rem}.logo[_ngcontent-%COMP%]   .icon-title[_ngcontent-%COMP%]   .ci[_ngcontent-%COMP%]{width:5rem;height:5rem}.form-text[_ngcontent-%COMP%]{display:block;margin-top:.25rem}.sub-title[_ngcontent-%COMP%]{margin:2rem 0;text-align:center;font-size:1rem}.welcome[_ngcontent-%COMP%]{margin:0 0 4.25rem!important}.welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{text-align:center;font-size:30px;font-weight:700}.welcome[_ngcontent-%COMP%]   h3[_ngcontent-%COMP%]{text-align:center;font-size:12px}mat-spinner[_ngcontent-%COMP%]{margin:auto}@media only screen and (max-width: 767px){.welcome[_ngcontent-%COMP%]{margin:1.3rem 0 2.8rem!important}.welcome[_ngcontent-%COMP%]   h2[_ngcontent-%COMP%]{font-size:16px}.logo[_ngcontent-%COMP%]{width:80%;margin:auto}}.no-margin-bottom[_ngcontent-%COMP%]{margin-bottom:0!important}.no-margin-top[_ngcontent-%COMP%]{margin-top:0!important}']
                    }),
                    o
                }
                )()
            }, {
                path: "logout",
                component: (()=>{
                    class o {
                        constructor(n, e, r) {
                            this.router = n,
                            this.loginService = e,
                            this.storageService = r,
                            this.logout()
                        }
                        ngOnInit() {
                            this.logout()
                        }
                        logout() {
                            this.loginService.logout(),
                            this.storageService.storeObject(null, "app_logged_user"),
                            this.storageService.clear("app_logged_user"),
                            this.storageService.storeObject(null, "app_logged_user_menu"),
                            this.storageService.clear("app_logged_user_menu"),
                            this.router.navigate(b.g.onlyLoggedUsers ? ["login"] : ["produtos"])
                        }
                    }
                    return o.\u0275fac = function(n) {
                        return new (n || o)(t.\u0275\u0275directiveInject(u.F0),t.\u0275\u0275directiveInject(T.r),t.\u0275\u0275directiveInject(F.V))
                    }
                    ,
                    o.\u0275cmp = t.\u0275\u0275defineComponent({
                        type: o,
                        selectors: [["edm-logout"]],
                        decls: 0,
                        vars: 0,
                        template: function(n, e) {}
                    }),
                    o
                }
                )()
            }, {
                path: "**",
                redirectTo: "",
                pathMatch: "full"
            }]
        }];
        let ht = (()=>{
            class o {
            }
            return o.\u0275fac = function(n) {
                return new (n || o)
            }
            ,
            o.\u0275mod = t.\u0275\u0275defineNgModule({
                type: o
            }),
            o.\u0275inj = t.\u0275\u0275defineInjector({
                imports: [u.Bz.forChild(ut), u.Bz]
            }),
            o
        }
        )();
        var Mt = a(29885)
          , _t = a(7133)
          , bt = a(87258);
        const Pt = null;
        let Ot = (()=>{
            class o {
            }
            return o.\u0275fac = function(n) {
                return new (n || o)
            }
            ,
            o.\u0275mod = t.\u0275\u0275defineNgModule({
                type: o
            }),
            o.\u0275inj = t.\u0275\u0275defineInjector({
                providers: [C.MJ],
                imports: [ht, Mt.O, C.Yd, S.Cq, _t.h, d.j5J, d.zyh, d.MAY, d.BW0, d._WB, d.EbI, d.P1, d.EoG, d.SDF, d.KdK, d.AE1, d.MfT, d.spT, d.HKp, d.DfH, d.T2N, d.IIj, d.j7H, c.u5, c.UX, x.IJ, et, B.yI.forRoot(), bt.TimelineModule, f.CommonModule, M.J7]
            }),
            o
        }
        )()
    }
}]);
