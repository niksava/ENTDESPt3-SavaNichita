package org.entdes.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodolistController {
    private final GestorTasques gestor = new GestorTasques();

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/tasques")
    public String getTasques(Model model) {
        model.addAttribute("tasques", gestor.obtenirTasques());
        return "tasques";
    }

    @PostMapping("/tasques")
    public String addTasca(@RequestParam String descripcio, Model model) {
        String index = getString(descripcio, model);
        if (index != null) return index;
        gestor.crearTasca(descripcio.trim());
        return "redirect:/tasques";
    }

    private static String getString(String descripcio, Model model) {
        if (descripcio == null || descripcio.trim().isEmpty()) {
            model.addAttribute("errorMessage", "La descripció no pot estar buida.");
            return "index";
        }
        return null;
    }

    @PostMapping("/tasques/update/{descripcio}")
    public String updateTasca(@PathVariable String descripcio, Model model) {
        if (descripcio == null || descripcio.trim().isEmpty()) {
            model.addAttribute("errorMessage", "Descripció no vàlida.");
            return "redirect:/tasques";
        }
        gestor.marcarCompletada(descripcio.trim());
        return "redirect:/tasques";
    }

    @PostMapping("/tasques/delete/{descripcio}")
    public String deleteTasca(@PathVariable String descripcio, Model model) {
        if (descripcio == null || descripcio.trim().isEmpty()) {
            model.addAttribute("errorMessage", "Descripció no vàlida.");
            return "redirect:/tasques";
        }
        gestor.eliminarTasca(descripcio.trim());
        return "redirect:/tasques";
    }
}



// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
// Afegit per demostrar control de versions2
