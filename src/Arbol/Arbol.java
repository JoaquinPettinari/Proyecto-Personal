package Arbol;

public class Arbol {
	private static final Nodo Nodo = null;
	Nodo raiz;

	public Arbol() {
		raiz = null;
	}

	public void agregarDato(int dato) {
		if (this.raiz == null) {
			Nodo actual = new Nodo();
			actual.dato = dato;
			this.raiz = actual;
		} else {
			agregarDato(dato, this.raiz);
		}
	}

	public void agregarDato(int dato, Nodo raiz) {
		if (raiz.dato == dato) {
			System.out.print("No se pueden agregar datos iguales");
			return;
		} else if (dato < raiz.dato) {
			if (raiz.izquierdo == null) {
				Nodo actual = new Nodo();
				actual.dato = dato;
				raiz.izquierdo = actual;
				return;
			}
			agregarDato(dato, raiz.izquierdo);
		} else if (dato > raiz.dato) {
			if (raiz.derecho == null) {
				Nodo actual = new Nodo();
				actual.dato = dato;
				raiz.derecho = actual;
				return;
			}
			agregarDato(dato, raiz.derecho);
		}
	}

	public void preOrden() {
		if (this.raiz.izquierdo == null && this.raiz.derecho == null) {
			System.out.println(this.raiz.dato);
		} else {
			System.out.println(this.raiz.dato);
			if (this.raiz.izquierdo != null) {
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				izq.preOrden();
			}
			if (this.raiz.derecho != null) {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				der.preOrden();
			}
		}
	}

	public void inOrden() {
		if ((this.raiz).izquierdo == null && (this.raiz).derecho == null) {
			System.out.println(this.raiz.dato);
		} else {
			if (this.raiz.izquierdo != null) {
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				izq.inOrden();
			}
			System.out.println(this.raiz.dato);
			if (this.raiz.derecho != null) {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				der.inOrden();
			}
		}
	}

	public void postOrden() {
		if (this.raiz.izquierdo == null && this.raiz.derecho == null) {
			System.out.println(this.raiz.dato);
		} else {
			if (this.raiz.izquierdo != null) {
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				izq.postOrden();
			}
			if (this.raiz.derecho != null) {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				der.postOrden();
			}
			System.out.println(this.raiz.dato);
		}
	}

	public void eliminar(int dato) {
		if (this.raiz.dato == dato) {
			if (esHoja(this.raiz)) {
				this.raiz = null;
			} else if (this.raiz.derecho != null && this.raiz.izquierdo == null) {
				this.raiz = this.raiz.derecho;
			} else if (this.raiz.derecho == null && this.raiz.izquierdo != null) {
				this.raiz = this.raiz.izquierdo;
			} else {
				Nodo predecesor = predecesor();
				eliminar(predecesor.dato);
				predecesor.izquierdo = this.raiz.izquierdo;
				predecesor.derecho = this.raiz.derecho;
				this.raiz = predecesor;
			}
		} else {

			if (dato > this.raiz.dato) {
				if (this.raiz.derecho.dato == dato) {
					if (this.esHoja(this.raiz.derecho)) {
						this.raiz.derecho = null;
					} else if (this.raiz.derecho.derecho != null
							&& this.raiz.derecho.izquierdo == null) {
						this.raiz.derecho = this.raiz.derecho.derecho;
					} else if (this.raiz.derecho.derecho == null
							&& this.raiz.derecho.izquierdo != null) {
						this.raiz.derecho = this.raiz.derecho.izquierdo;
					} else {
						Arbol aux = subArbDer();
						Nodo predecesor = aux.predecesor();
						aux.eliminar(predecesor.dato);
						predecesor.izquierdo = this.raiz.derecho.izquierdo;
						predecesor.derecho = this.raiz.derecho.derecho;
						this.raiz.derecho = predecesor;
					}
				} else {
					Arbol der = subArbDer();
					der.eliminar(dato);
				}
			}

			if (dato < this.raiz.dato) {
				if (this.raiz.izquierdo.dato == dato) {
					if (this.esHoja(this.raiz.izquierdo)) {
						this.raiz.izquierdo = null;
					} else if (this.raiz.izquierdo.izquierdo != null
							&& this.raiz.izquierdo.derecho == null) {
						this.raiz.izquierdo = this.raiz.izquierdo.izquierdo;
					} else if (this.raiz.izquierdo.izquierdo == null
							&& this.raiz.izquierdo.derecho == null) {
						this.raiz.izquierdo = this.raiz.izquierdo.derecho;
					} else {
						Arbol aux = subArbIzq();
						Nodo predecesor = aux.predecesor();
						aux.eliminar(predecesor.dato);
						predecesor.izquierdo = this.raiz.izquierdo.izquierdo;
						predecesor.derecho = this.raiz.izquierdo.derecho;
						this.raiz.izquierdo = predecesor;

					}

				} else {
					Arbol izq = subArbIzq();
					izq.eliminar(dato);
				}
			}
		}
	}

	public int pesoArbol() {
		return this.pesoArbol(0);
	}

	public int pesoArbol(int cantidad) {
		if ((this.raiz).izquierdo == null && (this.raiz).derecho == null) {
			return 1;
		} else {
			if (this.raiz.izquierdo != null && this.raiz.derecho == null) {

				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				return 1 + izq.pesoArbol(cantidad);

			} else if (this.raiz.derecho != null && this.raiz.izquierdo == null) {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				return 1 + der.pesoArbol(cantidad);
			} else {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				return 1 + der.pesoArbol(cantidad) + izq.pesoArbol(cantidad);
			}
		}
	}

	public boolean tieneHijos(Nodo nodito) {
		if (nodito.derecho != null || nodito.izquierdo != null) {
			return true;
		} else
			return false;
	}

	public boolean esHoja(Nodo nodo) {
		return nodo.derecho == null && nodo.izquierdo == null;
	}

	public int profundidadDeUnNodo(int dato) {
		return profundidadDeUnNodo(dato, 0);
	}

	public int profundidadDeUnNodo(int dato, int cantidad) {
		if (this.raiz.dato == dato) {
			return cantidad;
		} else {
			if (dato > this.raiz.dato) {
				Arbol der = subArbDer();
				der.raiz = this.raiz.derecho;
				return 0 + der.profundidadDeUnNodo(dato, cantidad + 1);
			} else {
				Arbol izq = subArbIzq();
				izq.raiz = this.raiz.izquierdo;
				return 0 + izq.profundidadDeUnNodo(dato, cantidad + 1);
			}
		}
	}

	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public int alturaMaxima() {
		if (this.raiz == null) {
			return 0;
		} else
			return alturaMaxima(this.raiz);
	}

	public int alturaMaxima(Nodo raiz) {
		if ((raiz.derecho == null) && (raiz.izquierdo == null))
			return 0;
		else
			return 1 + max(alturaMaxima(raiz.izquierdo),alturaMaxima(raiz.derecho));
	}

	public void recorrerMostrandoNivel() {
		recorrerMostrandoNivel(0);
	}

	public void recorrerMostrandoNivel(int n) {

		if ((this.raiz).izquierdo == null && (this.raiz).derecho == null) {
			System.out.print("Dato: " + this.raiz.dato + " ");
			System.out.println("Nivel: " + n + " ");
			n = 0;
		} else {
			System.out.print("Dato: " + this.raiz.dato + " ");
			System.out.println("Nivel: " + n + " ");
			if (this.raiz.izquierdo != null) {
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				izq.recorrerMostrandoNivel(n + 1);
			}
			if (this.raiz.derecho != null) {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				der.recorrerMostrandoNivel(n + 1);
			}

		}
	}

	public int gradoDeUnNodo(int dato) {
		if (dato == this.raiz.dato) {
			if (this.raiz.derecho == null && this.raiz.izquierdo == null) {
				return 0;
			} else if (this.raiz.derecho != null && this.raiz.izquierdo == null) {
				return 1;
			} else if (this.raiz.derecho == null && this.raiz.izquierdo != null) {
				return 1;
			} else {
				return 2;
			}
		} else {
			if (dato > this.raiz.dato) {
				Arbol der = subArbDer();
				return der.gradoDeUnNodo(dato);
			} else {
				Arbol izq = subArbIzq();
				return izq.gradoDeUnNodo(dato);
			}
		}
	}

	public int cantidadHojas() {
		if (this.raiz != null) {
			return cantidadHojas(this.raiz);
		} else {
			return 0;
		}

	}

	public int cantidadHojas(Nodo nodito) {

		if (nodito.derecho != null && nodito.izquierdo != null) {
			return cantidadHojas(nodito.derecho)
					+ cantidadHojas(nodito.izquierdo);
		} else if (nodito.derecho != null && nodito.izquierdo == null) {
			return cantidadHojas(nodito.derecho);
		} else if (nodito.derecho == null && nodito.izquierdo != null) {
			return cantidadHojas(nodito.izquierdo);
		}

		else {
			return 0;
		}

	}

	// MAXIMO - MINIMO
	public int maximo() {
		return this.maximo(this.raiz).dato;
	}

	private Nodo maximo(Nodo nodo) {
		if (nodo.derecho == null) {
			return nodo;
		} else {
			return maximo(nodo.derecho);
		}
	}

	public int minimo() {
		return this.minimo(this.raiz).dato;
	}

	private Nodo minimo(Nodo nodo) {
		if (nodo.izquierdo == null) {
			return nodo;
		} else {
			return minimo(nodo.izquierdo);
		}
	}

	// PREDECESOR
	public Nodo predecesor() {
		Arbol aux = subArbIzq();
		return aux.maximo(aux.raiz);
	}

	// SUCESOR
	public Nodo sucesor() {
		Arbol aux = subArbDer();
		return aux.minimo(aux.raiz);
	}

	// ARBOLES NUEVOS IZQUIERDOS - DERECHOS
	public Arbol subArbIzq() {
		Arbol izquierdo = new Arbol();
		izquierdo.raiz = this.raiz.izquierdo;
		return izquierdo;
	}

	public Arbol subArbDer() {
		Arbol der = new Arbol();
		der.raiz = this.raiz.derecho;
		return der;
	}

	public int sumaDeDatos() {
		if (this.raiz.derecho == null && this.raiz.izquierdo == null) {
			return this.raiz.dato;
		} else {
			if (this.raiz.izquierdo != null && this.raiz.derecho != null) {
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				return this.raiz.dato + izq.sumaDeDatos() + der.sumaDeDatos();

			} else if (this.raiz.izquierdo != null) {
				Arbol izq = new Arbol();
				izq.raiz = this.raiz.izquierdo;
				return this.raiz.dato + izq.sumaDeDatos();

			} else {
				Arbol der = new Arbol();
				der.raiz = this.raiz.derecho;
				return this.raiz.dato + der.sumaDeDatos();
			}
		}
	}
	

}